package lucascantao.tees.atividade1.Notifier;

public class BaseNotifierDecorator implements INotifier {

    private final INotifier wrapped;
    // protected final DataBaseService databaseService;

    BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void send(String msg) {
        wrapped.send(msg);
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }
    
}
