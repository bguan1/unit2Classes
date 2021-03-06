import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Target target1 = new Target(100,200);
        
        int x = getWidth(); 
        int y = getHeight();
        
        Target target2 = new Target(100, 50);
       
        target2.draw(g2);
        target1.draw(g2);
    }
}