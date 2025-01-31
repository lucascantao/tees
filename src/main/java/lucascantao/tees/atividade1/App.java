package lucascantao.tees.atividade1;

import lucascantao.tees.atividade1.Notifier.FacebookDecorator;
import lucascantao.tees.atividade1.Notifier.INotifier;
import lucascantao.tees.atividade1.Notifier.Notifier;
import lucascantao.tees.atividade1.Notifier.WhatsAppDecorator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        INotifier notifier = new FacebookDecorator(
            new WhatsAppDecorator(
                new Notifier("Lucas")
            )
        );

        notifier.send("Hello wolrd");
    }
}
