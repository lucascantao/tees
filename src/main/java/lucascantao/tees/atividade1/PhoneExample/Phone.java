package lucascantao.tees.atividade1.PhoneExample;

public class Phone {
    
    private State state;
    
    public Phone() {
        this.state = new OffState(this);
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public State getState() {
        return state;
    }
    
    public String lock() {
        return "Locked and turned off";
    }
    
    public String unlock() {
        return "Unlocked";
    }
    
    public String home() {
        return "Home";
    }
    
    public String turnOn() {
        return "Turned on";
    }
    
}
