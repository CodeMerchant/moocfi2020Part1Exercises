/*
Create a film class with the insatnce avriables name(String) and
ageRating(int). Write athe constructor public Film(String filmName, int filmAgeRating) for
the class and also the methods public String name() and public int ageRating(). The
first of these returns a the film title and the second returns the rating for the film title.
 */

/**
 *
 * @author musa
 */
public class Film {

    //instance variable
    private String name;
    private int ageRating;

    //creating constructor for film class
    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }

    //creating methods for film name and film rating
    public String name() {
        return this.name;
    }

    public int ageRating() {
        return this.ageRating;
    }
}
