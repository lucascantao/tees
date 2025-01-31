package lucascantao.tees.atividade1.Aula;

import java.util.Date;

public class Realizada extends State{

    public Realizada(Aula aula) {
        super(aula);
    }
    
    @Override
    public String onAulaIniciada(Date dataHoraInicioReal) {
        return "Aula já realizada";
    }

    @Override
    public String onAulaEncerrada(Date dataHoraFimReal) {
        return "Aula já realizada";
    }

    @Override
    public String onAulaNãoIniciada() {
        return "Aula já realizada";
    }
    
}
