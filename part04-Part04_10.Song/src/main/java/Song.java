/*
 Create a class called Song. The song has the instance variables name(String) and length(int)
in seconds. Both are set in the constructor public Song(String name, int length).
Also, add the to the obejct the methods public String name(), which returns the name
of the song, and the method public int length which returns the length of the song
 */
public class Song {

    //instance variables
    private String name;
    private int length;

    //Creating constructor
    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    //creating methods that return values
    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}
