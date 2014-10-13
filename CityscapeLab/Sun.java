
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * creates a sun in the sky
 * @author Bradley Guan
 * @version 7 October 2014
 */
public class Sun
{
    /**Center of tree leaves x value*/
    private int xLeft;
    /**Center of tree leaves y value*/
    private int yTop;
    
    public Sun(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double Sun = new Ellipse2D.Double(xLeft, yTop, 100, 100);
        g2.draw(Sun);
        g2.setColor(Color.YELLOW);
        g2.fill(Sun);
    }
}