import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Building
{
    private int xLeft;
    private int yTop;
    private int eEnd;
    
    public Building(int x, int y)
    {
        xLeft = x;
        yTop = y;
        eEnd = yTop + 100;
    }
    
    public void draw (Graphics2D g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle.Double rect = new Rectangle.Double(xLeft, yTop, 140, 140);
        g2.draw(rect);
        g2.setColor(Color.GRAY);
        g2.fill(rect);
        
        while (yTop < eEnd)
        {
            Rectangle.Double rect1 = new Rectangle.Double(xLeft + 20, yTop + 20, 20, 20);
            g2.draw(rect1);
            g2.setColor(Color.WHITE);
            g2.fill(rect1);
            
            Rectangle.Double rect2 = new Rectangle.Double(xLeft + 100, yTop + 20, 20, 20);
            g2.draw(rect2);
            g2.setColor(Color.WHITE);
            g2.fill(rect2);
            
            yTop = yTop + 40;
            
        }
    }
}
   
