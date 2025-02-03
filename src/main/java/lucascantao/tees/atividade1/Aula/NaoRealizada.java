package lucascantao.tees.atividade1.Aula;

import java.time.LocalDateTime;

public class NaoRealizada extends State{

    public NaoRealizada(Aula aula) {
        super(aula);
    }
    
    @Override
    public String onAulaIniciada(LocalDateTime dataHoraInicioReal) {
        System.out.println("\nestado: NaoRealizada -> Iniciada");
        return "Aula não iniciada";
    }

    @Override
    public String onAulaEncerrada(LocalDateTime dataHoraFimReal) {
        System.out.println("\nestado: NaoRealizada -> Encerrada");
        return "Aula não iniciada";
    }

    @Override
    public String onAulaNãoIniciada() {
        System.out.println("\nestado: NaoRealizada -> NaoIniciada");
        return "Aula não iniciada";
    }
    
}
