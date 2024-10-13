package Iterator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> movieList = Arrays.asList("Inception", "Interstellar", "Dunkirk");
        ListMovieCollection listMovieCollection = new ListMovieCollection(movieList);
        Iterator listIterator = listMovieCollection.makeIterator(); 

        System.out.println("Movies from List:");
        while (listIterator.hasMore()) { 
            System.out.println(listIterator.getNext());
        }

        String[] movieArray = { "The Matrix", "Avatar", "Titanic" };
        ArrayMovieCollection arrayMovieCollection = new ArrayMovieCollection(movieArray);
        Iterator arrayIterator = arrayMovieCollection.makeIterator(); 

        System.out.println("\nMovies from Array:");
        while (arrayIterator.hasMore()) { 
            System.out.println(arrayIterator.getNext()); 
        }
    }
}
