package lucascantao.tees.atividade1.Sorvete;

public class FlocosDecorator extends BolaDecorator{

    private double custo = 1.5;

    public FlocosDecorator(Sorvete sorvete) {
        super(sorvete);
    }
    @Override
    public double getCusto() {
        return super.getCusto() + custo;
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Bola de Flocos ($"+ custo +")";
    }
}
