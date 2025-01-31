package lucascantao.tees.atividade1.Aula;

import java.util.Date;

public class Aula {
        
    private State state;
    
    protected Date dataHoraInicioPlanejado;
    protected Date dataHoraFimPlanejado;
    protected Date dataHoraInicioReal;
    protected Date dataHoraFimReal;
    
    public Aula(Date dataHoraInicioPlanejado, Date dataHoraFimPlanejado) {
        this.dataHoraInicioPlanejado = dataHoraInicioPlanejado;
        this.dataHoraFimPlanejado = dataHoraFimPlanejado;
        this.state = new Planejada(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public String iniciada(Date dataHoraInicioReal) {
        this.dataHoraInicioReal = dataHoraInicioReal;
        return "Aula iniciada";
    }
    
    public String encerrada(Date dataHoraFimReal) {
        this.dataHoraFimReal = dataHoraFimReal;
        return "Aula encerrada";
    }
    
    public String naoIniciada() {
        return "Aula cancelada";
    }
    
}
