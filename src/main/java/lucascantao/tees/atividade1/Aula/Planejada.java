package lucascantao.tees.atividade1.Aula;

import java.util.Date;

public class Planejada extends State{

    public Planejada(Aula aula) {
            super(aula);
    }
    
    @Override
    public String onAulaIniciada(Date dataHoraInicioReal) {
        aula.setState(new EmRealizacao(aula));
        return aula.iniciada(dataHoraInicioReal);
    }

    @Override
    public String onAulaEncerrada(Date dataHoraFimReal) {
        return "Aula não iniciada";
    }

    @Override
    public String onAulaNãoIniciada() {
        aula.setState(new NaoRealizada(aula));
        return aula.naoIniciada();
    }
    
}
