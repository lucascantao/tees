package lucascantao.tees.atividade1.Aula;

import java.time.LocalDateTime;

public class Planejada extends State{

    public Planejada(Aula aula) {
            super(aula);
    }
    
    @Override
    public String onAulaIniciada(LocalDateTime dataHoraInicioReal) {
        System.out.println("\nestado: Planejada -> EmRealização");
        aula.setState(new EmRealizacao(aula));
        return aula.iniciada(dataHoraInicioReal);
    }

    @Override
    public String onAulaEncerrada(LocalDateTime dataHoraFimReal) {
        System.out.println("\nestado: Planejada -> Encerrada");
        return "Aula não iniciada";
    }

    @Override
    public String onAulaNãoIniciada() {
        System.out.println("\nestado: Planejada -> NaoRealizada");
        aula.setState(new NaoRealizada(aula));
        return aula.naoIniciada();
    }
    
}
