import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class GraphicsDemo extends JPanel
{
    Random random = new Random();
    int xStart, yStart, xEnd, yEnd;

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color. PINK);
        for (int i = 0; i < 100; i++)
        {
            xStart = random.nextInt(800);
            yStart = random.nextInt(600);
            xEnd = random.nextInt(800);
            yEnd = random.nextInt(600);
            Algorithm.drawBresenhamLine(xStart, yStart, xEnd, yEnd, g);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800,600);
    }
}