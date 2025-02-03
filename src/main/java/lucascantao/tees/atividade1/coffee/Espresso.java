package lucascantao.tees.atividade1.coffee;

public class Espresso implements Coffee{

    @Override
    public double getCost() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
    
}
