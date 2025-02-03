package lucascantao.tees.atividade1.Sorvete;

public class ChocolateDecorator extends BolaDecorator{

    private double custo = 1.5;

    public ChocolateDecorator(Sorvete sorvete) {
        super(sorvete);
    }
    @Override
    public double getCusto() {
        return super.getCusto() + custo;
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Bola de Chocolate ($"+ custo +")";
    }
}
