import java.util.HashMap;
import java.util.Random;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    private HashMap<String, Integer> myHashMap;
    private Random rnd;
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        myHashMap = new HashMap<String,Integer>();
        myHashMap.put ("Per", 22);
        myHashMap.put ("Kari", 20);
        rnd = new Random ();
        System.out.println(rnd);
    }
}
   