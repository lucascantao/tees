package lucascantao.tees.atividade1;

import java.time.LocalDateTime;

import lucascantao.tees.atividade1.Aula.Aula;
import lucascantao.tees.atividade1.Aula.EmRealizacao;
import lucascantao.tees.atividade1.Aula.State;
import lucascantao.tees.atividade1.Notifier.FacebookDecorator;
import lucascantao.tees.atividade1.Notifier.INotifier;
import lucascantao.tees.atividade1.Notifier.Notifier;
import lucascantao.tees.atividade1.Notifier.WhatsAppDecorator;
import lucascantao.tees.atividade1.Sorvete.ChocolateDecorator;
import lucascantao.tees.atividade1.Sorvete.ChocolateDietDecorator;
import lucascantao.tees.atividade1.Sorvete.CoberturaChocolateDecorator;
import lucascantao.tees.atividade1.Sorvete.Copo;
import lucascantao.tees.atividade1.Sorvete.NapolitanoDecorator;
import lucascantao.tees.atividade1.Sorvete.Sorvete;
import lucascantao.tees.atividade1.Sorvete.Taca;
import lucascantao.tees.atividade1.coffee.Coffee;
import lucascantao.tees.atividade1.coffee.MilkDecorator;
import lucascantao.tees.atividade1.coffee.SimpleCoffee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "\n" );

        Aula aula = new Aula(LocalDateTime.of(2025, 02, 15, 13, 0), LocalDateTime.of(2025, 02, 15, 14, 50));
        aula.getHorarioPlanejado();
        
        System.out.println( aula.getState().onAulaIniciada(LocalDateTime.of(2025, 02, 15, 13, 0)) );
        aula.getHorarioReal();
        
        System.out.println( aula.getState().onAulaIniciada(null) );

        System.out.println( aula.getState().onAulaEncerrada(LocalDateTime.of(2025, 02, 15, 14, 45)) );
        aula.getHorarioReal();
    
        System.out.println( "\n" );
        
    }
}
