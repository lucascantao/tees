package lucascantao.tees.atividade1.Aula;

import java.time.LocalDateTime;

public class Aula {
        
    private State state;
    
    protected LocalDateTime dataHoraInicioPlanejado;
    protected LocalDateTime dataHoraFimPlanejado;
    protected LocalDateTime dataHoraInicioReal;
    protected LocalDateTime dataHoraFimReal;
    
    public Aula(LocalDateTime dataHoraInicioPlanejado, LocalDateTime dataHoraFimPlanejado) {
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
    
    public String iniciada(LocalDateTime dataHoraInicioReal) {
        this.dataHoraInicioReal = dataHoraInicioReal;
        return "Aula iniciada";
    }
    
    public String encerrada(LocalDateTime dataHoraFimReal) {
        this.dataHoraFimReal = dataHoraFimReal;
        return "Aula encerrada";
    }
    
    public String naoIniciada() {
        return "Aula cancelada";
    }

    public void getHorarioPlanejado() {
        System.out.println("Horario Planejado: " + this.dataHoraInicioPlanejado + " - " + this.dataHoraFimPlanejado);
    }

    public void getHorarioReal() {
        System.out.println("Horario Real: " + this.dataHoraInicioReal + " - " + this.dataHoraFimReal);
    }
    
}
