package lucascantao.tees.atividade1.Sorvete;

public class NapolitanoDecorator extends BolaDecorator{

    private double custo = 1.5;

    public NapolitanoDecorator(Sorvete sorvete) {
        super(sorvete);
    }
    @Override
    public double getCusto() {
        return super.getCusto() + custo;
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Bola de Napolitano ($"+ custo +")";
    }
}
