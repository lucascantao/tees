package lucascantao.tees.atividade1.Sorvete;

public class MorangoDecorator extends BolaDecorator{

    private double custo = 1.5;

    public MorangoDecorator(Sorvete sorvete) {
        super(sorvete);
    }
    @Override
    public double getCusto() {
        return super.getCusto() + custo;
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Bola de Morango ($"+ custo +")";
    }
}
