package lucascantao.tees.atividade1.Sorvete;

public class CoberturaCarameloDecorator extends CoberturaDecorator{

    private double custo = 0.5;

    public CoberturaCarameloDecorator(Sorvete sorvete) {
        super(sorvete);
    }
    @Override
    public double getCusto() {
        return super.getCusto() + custo;
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Cobertura de Caramelo ($"+ custo +")";
    }
}
