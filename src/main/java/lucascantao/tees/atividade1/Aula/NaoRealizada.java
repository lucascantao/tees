package lucascantao.tees.atividade1.Aula;

import java.util.Date;

public class NaoRealizada extends State{

    public NaoRealizada(Aula aula) {
        super(aula);
    }
    
    @Override
    public String onAulaIniciada(Date dataHoraInicioReal) {
        return "Aula não iniciada";
    }

    @Override
    public String onAulaEncerrada(Date dataHoraFimReal) {
        return "Aula não iniciada";
    }

    @Override
    public String onAulaNãoIniciada() {
        return "Aula não iniciada";
    }
    
}
