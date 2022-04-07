import javax.swing.*;

import javafx.scene.paint.Color;

public class BreakoutPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.AQUA);
        g.setColor(3,4,5);
        g.fillRect(Breakout.WIDTH, Breakout.HEIGHT);
    }
}
