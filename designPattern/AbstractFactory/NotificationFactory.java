package is.designPattern.AbstractFactory;

public interface NotificationFactory {// Abstract Factory: dichiara i metodi per creare i prodotti della famiglia
	Notifica creaNotifica();
    TemplateMessaggio creaTemplate();
}
