package lucascantao.tees.atividade1.Sorvete;

public class BolaDecorator implements Sorvete {
    protected Sorvete sorveteDecorado;
    public BolaDecorator(Sorvete sorvete) {
        this.sorveteDecorado = sorvete;
    }
    @Override
    public double getCusto() {
        return sorveteDecorado.getCusto();
    }
    @Override
    public String getDescricao() {
        return sorveteDecorado.getDescricao();
    }
}
