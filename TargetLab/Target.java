
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Target
{
    private int xLeft;
    private int yTop;
    
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double bigCircle = new Ellipse2D.Double(xLeft, yTop, 100, 100);
        Ellipse2D.Double biggCircle = new Ellipse2D.Double(xLeft+10, yTop+10, 80, 80);
        Ellipse2D.Double bigggCircle = new Ellipse2D.Double(xLeft+20, yTop+20, 60, 60);
        Ellipse2D.Double biggggCircle = new Ellipse2D.Double(xLeft+30, yTop+30, 40, 40);
        Ellipse2D.Double bigggggCircle = new Ellipse2D.Double(xLeft+40, yTop+40, 20, 20);
        
        g2.draw(bigCircle);
        g2.setColor(Color.BLACK);
        g2.fill(bigCircle);
        
        g2.draw(biggCircle);
        g2.setColor(Color.WHITE);
        g2.fill(biggCircle);
        
        g2.draw(bigggCircle);
        g2.setColor(Color.BLACK);
        g2.fill(bigggCircle);
        
        g2.draw(biggggCircle);
        g2.setColor(Color.WHITE);
        g2.fill(biggggCircle);
        
        g2.draw(bigggggCircle);
        g2.setColor(Color.BLACK);
        g2.fill(bigggggCircle);
    }
}
        
    