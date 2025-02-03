package lucascantao.tees.atividade1.Sorvete;

public class PaveDecorator extends BolaDecorator{

    private double custo = 1.5;

    public PaveDecorator(Sorvete sorvete) {
        super(sorvete);
    }
    @Override
    public double getCusto() {
        return super.getCusto() + custo;
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Bola de Pavê ($"+ custo +")";
    }
}
