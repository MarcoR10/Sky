import java.awt.*;

/**
 * Write a description of class Island here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Island
{
    private String color;
    private boolean Visibilidad;
    private int[][] location;

    /**
     * Constructor for objects of class Island
     */
    public Island(String color,int[][] polygon)
    {
        this.color = color;
        location = polygon;
        addIIsland(color,polygon);
    }

    /**
     * An example of a method - replace this comment with your own
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    private void addIIsland(String color,int[][] polygon){
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, color, new Polygon(polygon[0], polygon[1], polygon[0].length));
        canvas.wait(10);
    }
    
    public int[][] LocationIsland(){
        return location;
    }
    
    public void delIsland(){
        Canvas canvas = Canvas.getCanvas();
        canvas.erase(this);
    }
}
