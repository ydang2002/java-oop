package Tuan3_Bai7_8;
/*
   This class stores data about a song.
*/

public class Song
{
   private String title;   // The song's title
   private String artist;  // The song's artist

   /**
      Constructor
      @param title A reference to a String object
                   containing the song's title.
      @param artist A reference to a String object
                    containing the song's artist.
   */

   public Song(String title, String artist)
   {
      this.title = title;
      this.artist = artist;
   }

   /**
      The toString method
      @return A String object containing the name
              of the song and the artist.
   */
   
   /**
    * @return the title
    */
    public String getTitle() {
        return title;
    }

    /**
    * @param title
    * the title to set
    */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
    * @return the artist
    */
    public String getArtist() {
        return artist;
    }

    /**
    * @param artist
    * the artist to set
    */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /*
    * (non-Javadoc)
    *
    * @see java.lang.Object#toString()
    */

   public String toString()
   {
      return title + " by " + artist + "\n";
   }
}