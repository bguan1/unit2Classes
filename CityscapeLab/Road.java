import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Road
{
    private int xLeft;
    private int yTop;
    
    public Road(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Rectangle.Double Rect = new Rectangle.Double(xLeft, yTop, 800 , 150);
        g2.draw(Rect);
        g2.setColor(Color.BLACK);
        g2.fill(Rect);
        
        while (xLeft < 800)
        {
            Rectangle.Double rect1 = new Rectangle.Double(xLeft + 20, yTop + 65, 40, 20);
            g2.draw(rect1);
            g2.setColor(Color.YELLOW);
            g2.fill(rect1);
            xLeft = xLeft + 80;
        }
    }
}