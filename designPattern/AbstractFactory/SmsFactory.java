package is.designPattern.AbstractFactory;

public class SmsFactory implements NotificationFactory {// Factory concreta della famiglia SMS
	 @Override
	    public Notifica creaNotifica() {
	        return new SmsNotifica();
	    }
	    @Override
	    public TemplateMessaggio creaTemplate() {
	        return new SmsTemplate();
	    }
}
