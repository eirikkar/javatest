
public class Album
{
    private String title;
    private String artist;
    private int year;
    private boolean hasPlayed;
    /**
     * Constructor for objects of class Album
     */
    public Album(String title, int year)
    {
       this.title = title;
       this.year = year;
    }
    
    /**
     * Method setTitle
     *
     */
    public void setTitle () {
        this.title = title;
    }
    
    /**
     * Method setArtist
     *
     */
    public void setArtist () {
        this.artist = artist;
    }
    
    /**
     * Method setYear
     *
     */
    public void setYear () {
        this.year = year;
    }
    
    /**
     * Method setHasPlayed
     *
     */
    public void setHasPlayed () {
        this.hasPlayed = hasPlayed;
    }
    
    /**
     * Method getTitle
     *
     * @return The return value
     */
    public String getTitle () {
        return title;
    }
    
    /**
     * Method getArtist
     *
     * @return The return value
     */
    public String getArtist () {
        return artist;
    }
    
    /**
     * Method getYear
     *
     * @return The return value
     */
    public int getYear () {
        return year;
    }
    
    /**
     * Method getHasPlayed
     *
     * @return The return value
     */
    public boolean getHasPlayed () {
        return hasPlayed;
    }
}
