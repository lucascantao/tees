package lucascantao.tees.atividade1.PhoneExample;

public class OffState extends State{

    OffState(Phone phone) {
        super(phone);
    }
    
    @Override
    public String onHomeButton() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

    @Override
    public String onPowerButton() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }
    
}
