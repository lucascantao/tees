package lucascantao.tees.atividade1.Aula;

import java.util.Date;

public class EmRealizacao extends State{

    public EmRealizacao(Aula aula) {
        super(aula);
    }
    
    @Override
    public String onAulaIniciada(Date dataHoraInicioReal) {
        return "Aula já iniciada";
    }

    @Override
    public String onAulaEncerrada(Date dataHoraFimReal) {
        aula.setState(new Realizada(aula));
        return aula.encerrada(dataHoraFimReal);
    }

    @Override
    public String onAulaNãoIniciada() {
        return "Aula já iniciada";
    }
    
}
