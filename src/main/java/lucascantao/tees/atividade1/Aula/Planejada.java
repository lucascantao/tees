package lucascantao.tees.atividade1.Aula;

public class Planejada extends State{

    public Planejada(Aula aula) {
            super(aula);
    }
    
    @Override
    public String onAulaIniciada() {
        return "Aula iniciada"; //todo
    }

    @Override
    public String onAulaEncerrada() {
        throw new UnsupportedOperationException("Unimplemented method 'onAulaEncerrada'");
    }

    @Override
    public String onAulaNãoIniciada() {
        throw new UnsupportedOperationException("Unimplemented method 'onAulaNãoIniciada'");
    }
    
}
