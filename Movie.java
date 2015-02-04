/**
 * Created by Ben on 1/22/2015.
 */
public class Movie {
    // has things(fields, instance variables)
    private String name;
    private int year;

    //can do things(method, behavior)
    public Movie(String name, int year){
        this.name = name;
        this.year = year;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }

    //this allows a Movie to be printed to the console
    public String toString(){
        String result = this.name + " (" + this.year + ")";
        return result;
    }

    public boolean equals(Movie otherMovie){
        if(this.name.equals(otherMovie.name) &&
           this.year == otherMovie.year);
        return false;
    }
}
