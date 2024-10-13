package Iterator;

public class ArrayMovieCollection implements MovieCollection {
    private String[] movies;

    public ArrayMovieCollection(String[] movies) {
        this.movies = movies;
    }

    @Override
    public Iterator makeIterator() { 
        return new ArrayMovieIterator(movies);
    }
}
