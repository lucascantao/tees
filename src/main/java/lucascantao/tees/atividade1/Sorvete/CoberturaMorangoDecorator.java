package lucascantao.tees.atividade1.Sorvete;

public class CoberturaMorangoDecorator extends CoberturaDecorator{

    private double custo = 0.5;

    public CoberturaMorangoDecorator(Sorvete sorvete) {
        super(sorvete);
    }
    @Override
    public double getCusto() {
        return super.getCusto() + custo;
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Cobertura de Morango ($"+ custo +")";
    }
}
