package lucascantao.tees.atividade1.PhoneExample;

public abstract class State {
    protected Phone phone;
    State(Phone phone) {
        this.phone = phone;
    }
    
    public abstract String onHomeButton();
    public abstract String onPowerButton();
}
