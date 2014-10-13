import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Tree
{
    private int xLeft;
    private int yTop;
    
    public Tree(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double Leaves = new Ellipse2D.Double(xLeft, yTop, 40, 40);
        g2.draw(Leaves);
        g2.setColor(Color.GREEN);
        g2.fill(Leaves);
        
        Rectangle.Double Trunk = new Rectangle.Double(xLeft + 10 , yTop + 40, 20, 80);
        g2.draw(Trunk);
        g2.setColor(new Color(156, 93, 82));
        g2.fill(Trunk);
    }
}