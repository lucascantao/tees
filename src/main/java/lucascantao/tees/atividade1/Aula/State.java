package lucascantao.tees.atividade1.Aula;

public abstract class State {
    
    protected Aula aula;
    
    public State(Aula aula) {
        this.aula = aula;
    }
    
    public abstract String onAulaIniciada();
    
    public abstract String onAulaEncerrada();
    
    public abstract String onAulaNãoIniciada();
    
}
