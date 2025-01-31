package lucascantao.tees.atividade1.Notifier;

public class WhatsAppDecorator extends BaseNotifierDecorator { 
    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public void send(String msg) {
        super.send(msg);
        System.out.println("Sending " + msg + " by WhatsApp via " + "+55999999999");
    }
}
