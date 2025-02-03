package lucascantao.tees.atividade1.Aula;

import java.time.LocalDateTime;

public class Realizada extends State{

    public Realizada(Aula aula) {
        super(aula);
    }
    
    @Override
    public String onAulaIniciada(LocalDateTime dataHoraInicioReal) {
        System.out.println("\nestado: Realizada -> Iniciada");
        return "Aula já realizada";
    }

    @Override
    public String onAulaEncerrada(LocalDateTime dataHoraFimReal) {
        System.out.println("\nestado: Realizada -> Encerrada");
        return "Aula já realizada";
    }

    @Override
    public String onAulaNãoIniciada() {
        System.out.println("\nestado: Realizada -> NaoIniciada");
        return "Aula já realizada";
    }
    
}
