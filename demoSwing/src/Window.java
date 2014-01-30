/**
 *
 * @author ethan.rae045
 */

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
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
        //JButton funcButton = new JButton("Do Something");
        endButton.addActionListener(new Listener( ));
        //funcButton.addActionListener(new Listener( ));
        JButton funcButton = new JButton( new AbstractAction("add") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            // add Action
        }
    });
        add(endButton);
    }
}
