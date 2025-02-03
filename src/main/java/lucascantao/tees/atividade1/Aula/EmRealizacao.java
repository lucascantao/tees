package lucascantao.tees.atividade1.Aula;

import java.time.LocalDateTime;

public class EmRealizacao extends State{

    public EmRealizacao(Aula aula) {
        super(aula);
    }
    
    @Override
    public String onAulaIniciada(LocalDateTime dataHoraInicioReal) {
        System.out.println("\nestado: EmRealização -> Iniciada");
        return "Aula já iniciada";
    }

    @Override
    public String onAulaEncerrada(LocalDateTime dataHoraFimReal) {
        System.out.println("\nestado: EmRealização -> Encerrada");
        aula.setState(new Realizada(aula));
        return aula.encerrada(dataHoraFimReal);
    }

    @Override
    public String onAulaNãoIniciada() {
        System.out.println("\nestado: EmRealização -> NaoIniciada");
        return "Aula já iniciada";
    }
    
}
