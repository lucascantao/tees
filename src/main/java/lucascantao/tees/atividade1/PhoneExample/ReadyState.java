package lucascantao.tees.atividade1.PhoneExample;

public class ReadyState extends State{

    ReadyState(Phone phone) {
        super(phone);
    }
    
    @Override
    public String onHomeButton() {
        return phone.home();
    }

    @Override
    public String onPowerButton() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
    
}
