/**
 *
 * @author ethan.rae045
 */
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Listener implements ActionListener
{
    public void actionPerformed(ActionEvent e) 
    {
       
        //System.out.println(e.getActionCommand());
        if(e.getActionCommand().equalsIgnoreCase("Do Something"))
        {
            JButton button = ((JButton)e.getSource());
            if(button.getBackground() == Color.cyan)
                ((JButton)e.getSource()).setBackground(Color.red);
            else if(button.getBackground() == Color.red)
                button.setBackground(Color.orange);  
            else
                button.setBackground(Color.cyan);
            
            JPanel panel = (JPanel)button.getParent();
            if(panel.getBackground() != Color.BLACK)
                panel.setBackground(Color.BLACK);
            else
                panel.setBackground(Color.WHITE);
        }else
        {
            System.exit(0);
        }
        
        
    }
}
