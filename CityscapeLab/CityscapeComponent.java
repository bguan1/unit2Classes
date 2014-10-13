import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Bradley Guan
 * @version 7 October 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // create instances of classes and invoke the draw method on each
        // ...
        Building building1 = new Building(100, 300);
        Building building2 = new Building(300, 300);
        Building building3 = new Building(500, 300);
        Tree tree1 = new Tree(680, 320);
        Tree tree2 = new Tree(30, 320);
        Road road1 = new Road(0, 440);
        Sun sun1 = new Sun(500, 100);
        Background background1 = new Background(0, 0);
        int x = getWidth();
        int y = getHeight();
        
       background1.draw(g2);
       building1.draw(g2);
       building2.draw(g2);
       building3.draw(g2);
       road1.draw(g2);
       sun1.draw(g2);
       tree1.draw(g2);
       tree2.draw(g2);
    }

}
