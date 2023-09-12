import java.awt.*;
import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * 
 */
public class Iceepeecee {

    private int length,width;
    private HashMap<String,Island> Islands = new HashMap<>();
    private HashMap<String,Fly> Fligths = new HashMap<>();
    private boolean exito = true;
    
    /**
     * Constructor for objects of class Iceepeecee
     */
    public Iceepeecee(int length,int width) {
        this.length = length;
        this.width = width;
        Canvas canvas = Canvas.getCanvas(length,width);
    }
    
    public void addIsland(String color,int[][] polygon){
        Island island = new Island(color,polygon);
        Islands.put(color,island);
    }
    
    public void addFligth(String color,int[] from,int[] to){
        Fly vuelo = new Fly(color,from,to);
        Fligths.put(color,vuelo);
    }
    
    public void delIsland(String color){
        Island Isla = Islands.get(color);
        Isla.delIsland();
    }
    
    public void delFligth(String color){
        Fly vuelo = Fligths.get(color);
        vuelo.delFligth();
    }
    
    public int[][] IslandLocation(String island){
        Island isla = Islands.get(island);
        int[][] localizacion = isla.LocationIsland();
        return localizacion;
    }
    
    public int[][] FligthLocation(String fligth){
        Fly vuelo = Fligths.get(fligth);
        int[][] localizacion = vuelo.LocationFligth();
        return localizacion;
    }
    
    /**
    */
    public boolean ok(){
        return exito;
    }
    
    public void finish(){
        System.exit(0);
    }

}