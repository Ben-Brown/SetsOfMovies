import java.util.*;

/**
 * Created by Ben on 1/22/2015.
 */
public class MovieDriver {

    public static void main(String[] args) {
        System.out.println("Welcome to MovieFone");

        Movie m1 = new Movie("Reservoir Dogs", 1992);
        Movie m2 = new Movie("Pulp Fiction", 1994);
        Movie m3 = new Movie("Jackie Brown", 1997);
        Movie m4 = new Movie("Kill Bill Vol 1", 2003);
        Movie m5 = new Movie("Kill Bill Vol 2", 2004);
        Movie m6 = new Movie("Django Unchained", 2014);
        Movie m7 = new Movie("There Will Be Blood", 2007);
        Movie m8 = new Movie("Nightcrawler", 2014);
        Movie m9 = new Movie("True Romance", 1992);
        Movie m10 = new Movie("Good Will Hunting", 1997);
        Movie m11 = new Movie("Ronin", 1998);
        Movie m12 = new Movie("Inglorious Basterds", 2009);

        Set<Movie> library = new HashSet<Movie>();
        Set<Movie> favorites = new HashSet<Movie>();
        Set<Movie> watched = new HashSet<Movie>();
        Set<Movie> comedy = new HashSet<Movie>();
        Set<Movie> drama = new HashSet<Movie>();
        Set<Movie> action = new HashSet<Movie>();

        library.add(m1);
        library.add(m2);
        library.add(m3);
        library.add(m4);
        library.add(m5);
        library.add(m6);
        library.add(m7);
        library.add(m8);
        library.add(m9);
        library.add(m10);
        library.add(m11);
        library.add(m12);

        favorites.add(m1);
        favorites.add(m2);
        favorites.add(m7);
        favorites.add(m12);

        Iterator<Movie> currentFav = favorites.iterator();
        System.out.println(currentFav.next());
        System.out.println(currentFav.next());
        //System.out.println(currentFav.next());

        /*
        Part 4: Create a Map to associate an int number of views along with a Movie
         */
        Map<Movie, Integer> movieViews = new HashMap<Movie, Integer>();
        movieViews.put(m1, 2); //represents 2 viewings of movie 1

        /*
        Part 5: Create a Queue (first-in, first-out) to hold a movie playlist.
        */
        Queue<Movie>playList = new LinkedList<Movie>();
        playList.add(m1);   //adds movie m1 to the end of  playList
        Movie firstToPlay = playList.element(); //peek at the first movie in playList
        playList.remove();  //removes the first movie from playList


        watched.add(m1);
        watched.add(m2);
        watched.add(m3);
        watched.add(m4);
        watched.add(m5);
        watched.add(m6);
        watched.add(m7);

        action.add(m1);
        action.add(m6);
        action.add(m4);
        action.add(m5);
        action.add(m12);
        action.add(m11);

        drama.add(m1);
        drama.add(m2);
        drama.add(m4);
        drama.add(m5);
        drama.add(m10);

        favorites.clear(); //empty the favorites set

        System.out.println("Library is " + library);
        System.out.println("Favorites are " + favorites);

        SetHelper helper = new SetHelper();

        //calc the intersection of watched and dramas
        Set<Movie> watchedDramas = helper.intersect(watched, drama);
        Set<Movie> unwatched = helper.difference(library, watched);

        //unwatched comedies
        Set<Movie> unwatchedComs = helper.difference(unwatched, comedy);

        //unwatched movies after 2010
        Set<Movie> unwatchedNewReleases = new HashSet<Movie>();
        Iterator<Movie> currMovie = unwatched.iterator();
        while (currMovie.hasNext()) {
            Movie temp = currMovie.next();
            if (temp.getYear() >= 2010)
                System.out.println("Watch These!!!: " + unwatchedNewReleases);
            unwatchedNewReleases.add(temp);
        }
    }
}
