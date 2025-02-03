package lucascantao.tees.atividade1.Aula;

import java.time.LocalDateTime;

public abstract class State {
    
    protected Aula aula;
    
    public State(Aula aula) {
        this.aula = aula;
    }
    
    public abstract String onAulaIniciada(LocalDateTime dataHoraInicioReal);
    
    public abstract String onAulaEncerrada(LocalDateTime dataHoraFimReal);
    
    public abstract String onAulaNãoIniciada();
    
}
