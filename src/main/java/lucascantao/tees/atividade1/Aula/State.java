package lucascantao.tees.atividade1.Aula;

import java.util.Date;

public abstract class State {
    
    protected Aula aula;
    
    public State(Aula aula) {
        this.aula = aula;
    }
    
    public abstract String onAulaIniciada(Date dataHoraInicioReal);
    
    public abstract String onAulaEncerrada(Date dataHoraFimReal);
    
    public abstract String onAulaNãoIniciada();
    
}
