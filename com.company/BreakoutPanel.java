import javax.swing.*;
import java.util.*;

//import javafx.scene.paint.Color;
 import java.awt.*;

public class BreakoutPanel extends JPanel{

    private Bricks bit = new Bricks(100,100,100,100, new Color(2,3,4));
    public final static int NUM_COLUMNS = 16;
    public final static int NUM_ROWS = 10;

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.ORANGE);;
        g.fillRect(0,0,Breakout.WIDTH, Breakout.HEIGHT);
        bit.draw(g);
    }
    public void instantiateBricks(Graphics g){
        ArrayList<Integer>[][] bricks = new ArrayList[NUM_ROWS][NUM_COLUMNS];
        for (int r = 0; r < NUM_ROWS; r++) {
            for (int c = 0; c < NUM_COLUMNS; c++) {
                Bricks b = new Bricks(r, c, 100, 100, Color.RED);
                b.draw(g);
            }
        }
    }
}