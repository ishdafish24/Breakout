import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Breakout extends JFrame
{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    public Breakout()
    {
        super("My Alsome Game!!!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        Toolkit t = getToolkit();
        Dimension d = t.getScreenSize();
        System.out.println(d.getHeight());
        System.out.println(d.getWidth());
        setLocation(0, 0);
        setVisible(true);
    }

}
