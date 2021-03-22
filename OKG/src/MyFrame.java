import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
    GraphicsDemo graphicsDemo = new GraphicsDemo();


    public MyFrame()
    {

        this.setSize(800,600);
        this.setBackground(Color.WHITE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Алкоритм Брезенхема для построения 100 отрезков");
        this.add(graphicsDemo);
        this.pack();
        this.setVisible(true);
    }


}