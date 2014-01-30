/**
 *
 * @author ethan.rae045
 */

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame
{
    public static final int WIDTH = 300; 
    public static final int HEIGHT = 200;

    public Window( )
    {
        super( );
        setSize(WIDTH, HEIGHT);

        setTitle("First Window Class");

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JButton endButton = new JButton("Exit");
        JButton funcButton = new JButton("Do Something");
        
        endButton.setBackground(Color.red);
        //endButton.setBounds(50, 50, 50, 50);
        
        funcButton.setBackground(Color.cyan);
        //funcButton.setBounds(100, 100, 50, 50);
        
        endButton.addActionListener(new Listener( ));
        funcButton.addActionListener(new Listener( ));
        
        
        
        add(endButton);
        add(funcButton);
    }
}
