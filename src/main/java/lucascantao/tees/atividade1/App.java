package lucascantao.tees.atividade1;

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
        // INotifier notifier = new FacebookDecorator(
        //     new WhatsAppDecorator(
        //         new Notifier("Lucas")
        //     )
        // );

        // notifier.send("Hello wolrd");

        // Coffee coffee = new SimpleCoffee();
        // System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // coffee = new MilkDecorator(coffee);
        // System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        Sorvete sorvete = new Copo();
        System.out.println(sorvete.getDescricao() + " $" + sorvete.getCusto());

        sorvete = new ChocolateDecorator(sorvete);
        sorvete = new ChocolateDietDecorator(sorvete);
        sorvete = new NapolitanoDecorator(sorvete);
        
        sorvete = new CoberturaChocolateDecorator(sorvete);


        System.out.println(sorvete.getDescricao() + " $" + sorvete.getCusto());
    }
}
