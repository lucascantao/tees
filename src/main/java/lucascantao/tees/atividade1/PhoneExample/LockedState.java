package lucascantao.tees.atividade1.PhoneExample;

public class LockedState extends State{
    public LockedState(Phone phone) {
        super(phone);
    }
    
    @Override
    public String onHomeButton() {
        phone.setState(new ReadyState(phone));
        return phone.unlock();
    }
    
    @Override
    public String onPowerButton() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}
