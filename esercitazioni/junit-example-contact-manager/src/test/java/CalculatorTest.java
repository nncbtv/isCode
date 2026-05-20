import Calculator.Calculator;
import jdk.jfr.Name;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    public void setup() {
        System.out.println("Sto inizializzando la calcolatrice");
        calc = new Calculator();
    }

    @Nested
    @DisplayName("Test del metodo add")
    @Tag("Fast")
    class AddTest {
        @Test
        @DisplayName("Test somma numeri positivi")
        public void testAdd() {
            assertEquals(5.0,calc.add(2.0,3.0),1e-9);
            //richiamo il metodo add e controllo con assertEquals se il risultato è corretto
        }

        @Test
        @DisplayName("Test somma numeri negativi")
        public void testAddNeg() {
            assertEquals(-5.0,calc.add(-2.0,-3.0),1e-9);
        }

        @ParameterizedTest
        @CsvFileSource( resources = "/somme.csv" )
        public void shouldTestAdd(double a, double b, double risultatoAtteso) {
            assertEquals(risultatoAtteso,calc.add(a,b),1e-9);
        }
    }

    @Nested
    @DisplayName("Test del metodo subtract")
    @Tag("Fast")
    class SubtractTest {
        @Test
        @DisplayName("Sottrazione standard")
        public void testSubtract() {
            assertEquals(6.0,calc.subtract(10.0,4.0),1e-9);
        }
        @DisplayName("Test con X-X=0 per il momento X=42")
        @ParameterizedTest
        @ValueSource( doubles = {42.00} )
        public void testSubtractNeg(double a) {
            assertEquals(0,calc.subtract(a,a),1e-9);
        }
    }

    @Nested
    @DisplayName("Test del metodo multiply")
    class MultiplyTest {
        @Tag("Fast")
        @DisplayName("Moltiplicazione per zero")
        @ParameterizedTest
        @ValueSource( doubles = {1.0,2.0,3.0} )
        public void testMultiplyParameterized(double number) {
            assertEquals(0.0,calc.multiply(number,0),1e-9);
            //Prendo i numeri dal value source
        }

        @Tag("Fast")
        @DisplayName("Moltiplicazione CSV")
        @ParameterizedTest
        @CsvFileSource( resources = "/moltiplicazioni.csv" )
        public void shouldTestMultiply(double a, double b, double ris){
            assertEquals(ris, calc.multiply(a,b),1e-9);
        }
    }

    @Nested
    @DisplayName("Test del metodo divide")
    class DivideTest {
        @Tag("edge-case")
        @Test
        @DisplayName("Divisione con numero decimale")
        public void testDivide() {
            assertEquals(0.25,calc.divide(1.0,4.0),1e-9);
        }
        @DisplayName("Zero diviso per qualsiasi n!=0")
        @ParameterizedTest
        @ValueSource( doubles = {1.0,2.0,3.0} )
        public void testDivideZeroParameterized(double a) {
            assertEquals(0.0,calc.divide(0.0,a),1e-9);
            //Zero diviso ogni numero != da zero da zero
        }

        @Tag("Edge-case")
        @Test
        @DisplayName("Divisione di un n!=0 per 0")
        public void testDivideZero() {
            Exception e = assertThrows(IllegalArgumentException.class, () -> {
                calc.divide(5.0,0.0);
            });
            System.out.println("Messaggio: "+e.getMessage());
        }

        @Tag("Edge-case")
        @Test
        @DisplayName("Dividere zero per zero")
        public void testDivideZeroPerZero() {
            Exception e = assertThrows(Exception.class, () -> {
                calc.divide(0.0,0.0);
            });
            System.out.println("Messaggio: "+e.getMessage());
        }

        @Tag("Fast")
        @ParameterizedTest
        @ValueSource ( doubles = {1.0, 2.0, -5.0, 0.1, 100.0} )
        @Name("{0}+{1}={2}")
        public void testDivideNotException(double number) {
           assertDoesNotThrow(()->{
               calc.divide(100.0, number);
           });
        }
    }

    @Test
    @DisplayName("Test su tutte le operazioni con a = 6 e b = 3")
    @Timeout( value = 500, unit = TimeUnit.MILLISECONDS)
    void verificaTutteLeOperazioni(){
        double a=6.0;
        double b=3.0;
        assertAll(
                () -> assertEquals(9.00, calc.add(a, b), 1e-9),
                () -> assertEquals(3.0, calc.subtract(a,b), 1e-9),
                () -> assertEquals(18.0, calc.multiply(a,b), 1e-9),
                () -> assertEquals(2.0, calc.divide(a, b), 1e-9)
        );
    }

    @Test
    @Disabled("Metodo non ancora implementato in calculator")
    @DisplayName("Test Radice Quadrata")
    @Tag("edge-case")
    public void sqrt(){
       /* Exception e = assertThrows(Exception.class, () -> {
            assertEquals(4.0, calc.sqrt(16.0), 1e-9);
        });
        System.out.println("Messaggio: "+e.getMessage());*/
    };

    @Nested
    @DisplayName("Test Ripetuti")
    class Ripetuti{

        @RepeatedTest(10)
        @DisplayName("(3+7) deve sempre fare 10")
        public void add(RepetitionInfo repetitionInfo){
            double ris = calc.add(3.0,7.0);
            assertEquals(10.0, ris,1e-9, "Errore nella ripetizione: "+repetitionInfo.getCurrentRepetition());
        }

        @RepeatedTest(5)
        @DisplayName("Stabilità della moltiplicazione -2 * -3")
        void testMultiplyStability() {
            assertEquals(6.0, calc.multiply(-2.0, -3.0), 1e-9);
        }

        @Test
        @DisplayName("Test eseguito solo su Linux")
        void testSoloLinux() {

            Assumptions.assumeTrue(
                    System.getProperty("os.name").contains("Linux"),
                    "Test saltato perché non usi Linux"
            );

            assertEquals(6.0, calc.multiply(2.0, 3.0), 1e-9);
        }

        @Test
        @DisplayName("Test sempre skippato")
        void testSempreSkippato() {

            Assumptions.assumeTrue(false, "Sempre skippato");

            // questo codice NON verrà mai eseguito
            System.out.println("Ciao Matteo!");
        }
    }
}
