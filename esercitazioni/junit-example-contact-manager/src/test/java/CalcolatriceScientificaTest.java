import Calculator.CalcolatriceScientifica;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcolatriceScientificaTest {

    private CalcolatriceScientifica c;

    @BeforeEach
    public void setup() {
        System.out.println("Sto inizializzando la calcolatrice");
        c = new CalcolatriceScientifica();
    }

    @Nested
    @DisplayName("Test sul metodo power")
    class PowerTests {
        @Test
        @DisplayName("Potenza Semplice")
        @Tag("Fast")
        public void testPower(){
            c.power(2.00,3);
        }
        @ParameterizedTest
        @CsvFileSource( resources = "/potenze.csv" )
        @Tag("Fast")
        public void testPowerParameterized(double base, int esponente, double ris){
            assertEquals(ris, c.power(base, esponente), 1e-9);
        }
        @Test
        @DisplayName("Esponente Negativo")
        @Tag("Edge-case")
        public void testPowerException(){
            Exception e = assertThrows( Exception.class, () -> {
                c.power(2.00,-3);
            });
            System.out.println("Messaggio test: "+e.getMessage());
        }
    }

    @Nested
    @DisplayName("Test sul metodo sqrt")
    class SqrtTests {
        @Test
        @DisplayName("Radice Semplice")
        @Tag("Fast")
        public void testSqrt(){
            c.sqrt(16.00);
        }
        @Test
        @DisplayName("Numero Negativo")
        @Tag("Edge-case")
        public void testSqrtExcepiton(){
            Exception e = assertThrows( Exception.class, () -> {
               c.sqrt(-1.00);
            });
            System.out.println("Messaggio test: "+e.getMessage());
        }
    }

    @Nested
    @DisplayName("Test sul metodo Remainder")
    class RemainderTests {
        @Test
        @DisplayName("Test resto semplice")
        @Tag("Fast")
        public void testRemainder(){
            c.remainder(3.00,2);
        }
        @Test
        @DisplayName("Divisore zero")
        @Tag("Edge-case")
        public void testRemainderException(){
            Exception e = assertThrows( Exception.class, () -> {
                c.remainder(4.00,0);
            });
            System.out.println("Messaggio test: "+e.getMessage());
        }
    }
}
