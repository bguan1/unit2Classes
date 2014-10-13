import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Background
{
    private int xLeft;
    private int yTop;
    
    public Background(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Rectangle.Double Rect = new Rectangle.Double(0, 0, 800, 590);
        g2.draw(Rect);
        g2.setColor(Color.CYAN);
        g2.fill(Rect);
    }
}