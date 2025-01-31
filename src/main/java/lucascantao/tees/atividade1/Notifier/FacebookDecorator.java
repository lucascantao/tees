package lucascantao.tees.atividade1.Notifier;

public class FacebookDecorator extends BaseNotifierDecorator { 
    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public void send(String msg) {
        super.send(msg);
        System.out.println("Sending " + msg + " by Facebook to " + "facebook@username");
    }
}
