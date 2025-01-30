package lucascantao.tees.atividade1.Aula;

import java.util.Date;

public class Aula {
        
    private State state;
    
    protected Date dataHoraInicioPlanejado;
    protected Date dataHoraFimPlanejado;
    protected Date dataHoraInicioReal;
    protected Date dataHoraFimReal;
    
    public Aula() {
        this.state = new Planejada(this);
    }
    
    public String iniciada() {
        return "Aula iniciada";
    }
    
    public String encerrada() {
        return "Aula encerrada";
    }
    
    public String naoIniciada() {
        return "Aula cancelada";
    }
    
}
