import java.util.HashMap;
import java.util.Scanner;

/**
 * Write a description of class MusicLibrary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicLibrary
{
    private HashMap <String, Album> musicCollection;
    Scanner input = new Scanner(System.in);
    /**
     * Constructor for objects of class MusicLibrary
     */
    public MusicLibrary()
    {
        musicCollection = new HashMap<String , Album>();
    }
    public void addAlbum (Album album) {
        musicCollection.put (album.getTitle().toLowerCase() , album );
    }
    public void fillMusicLibrary () {
        addAlbum(new Album("Blue", 1989));
        addAlbum(new Album("Orange", 1994));
        addAlbum(new Album("Pink", 2001));
        addAlbum(new Album("Black", 2007));
    }
    public Album getAlbum (String title) {
        title = title.toLowerCase();
        return musicCollection.get(title);
    }
}
