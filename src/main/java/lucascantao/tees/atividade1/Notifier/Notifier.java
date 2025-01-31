package lucascantao.tees.atividade1.Notifier;

public class Notifier implements INotifier{

    private final String username;
    // private final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        // databaseService = new DatabaseService();
    }

    @Override
    public void send(String msg) {
        String email = "email";
        System.out.println("Sending " + msg + " by Mail to " + email);
    }
    @Override
    public String getUsername() {
        return username;
    }
    
}
