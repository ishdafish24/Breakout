import javax.swing.*;

//import javafx.scene.paint.Color;
 import java.awt.*;

public class BreakoutPanel extends JPanel{

    private Bricks b = new Bricks(100,100,100,100, new Color(2,3,4));

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.ORANGE);;
        g.fillRect(0,0,Breakout.WIDTH, Breakout.HEIGHT);
        b.draw(g);
    }
}