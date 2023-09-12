import java.awt.geom.*;

/**
 * Write a description of class Fly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fly{
    
    private String color;
    private int[] from,to;
    
    public Fly(String color,int[] from,int[] to){
        this.color = color;
        this.from = from;
        this.to = to;
        addFligth(color,from,to);
    }
    
    private void addFligth(String color,int[] from,int[] to){
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, color, new Line2D.Float(from[0],from[1],to[0],to[1]));
        canvas.wait(10);
    }
    
    public int[][] LocationFligth(){
        int[][] location = new int[2][];
        location[0] = from;
        location[1] = to;
        return location;
    }
    
    public void delFligth(){
        Canvas canvas = Canvas.getCanvas();
        canvas.erase(this);
    }
}