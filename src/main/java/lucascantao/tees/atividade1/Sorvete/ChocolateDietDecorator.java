package lucascantao.tees.atividade1.Sorvete;

public class ChocolateDietDecorator extends BolaDecorator{

    private double custo = 2.0;

    public ChocolateDietDecorator(Sorvete sorvete) {
        super(sorvete);
    }
    @Override
    public double getCusto() {
        return super.getCusto() + custo;
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Bola de Chocolate Diet ($"+ custo+")";
    }
}
