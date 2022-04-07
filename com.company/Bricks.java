import javafx.geometry.Rectangle2D;
import java.awt.Color;
import javax.swing.*;

import java.awt.*;

public class Bricks extends Rectangle2D{
    private Color color;
    public final static int HEIGHT = Breakout.HEIGHT /2 /* / BreakoutPanel.NUM_ROWS */;
    public final static int WIDTH = Breakout.WIDTH / 2 /* / BreakoutPanel.NUM_COLUMNS */;


    public Bricks(double x, double y, double w, double h, Color c){
        super(x,y,WIDTH,HEIGHT);
        color = c;
    }


    public void draw(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillRect(0,0, Breakout.WIDTH, Breakout.HEIGHT);
    }
}
