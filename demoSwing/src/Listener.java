/**
 *
 * @author ethan.rae045
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Listener implements ActionListener
{
    public void actionPerformed(ActionEvent e) 
    {
        System.out.println(e.getSource().toString());
        //System.out.println(e.getSource().toString());
        System.exit(0);
        
    }
}
