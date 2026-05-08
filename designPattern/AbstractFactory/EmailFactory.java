package is.designPattern.AbstractFactory;

public class EmailFactory implements NotificationFactory{// Factory concreta della famiglia Email
	@Override
	 public Notifica creaNotifica() {
        return new EmailNotifica();
    }
    @Override
    public TemplateMessaggio creaTemplate() {
        return new EmailTemplate();
    }
}
