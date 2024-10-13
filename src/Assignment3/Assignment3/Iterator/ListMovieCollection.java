package Iterator;

import java.util.List;

public class ListMovieCollection implements MovieCollection {
    private List<String> movies;

    public ListMovieCollection(List<String> movies) {
        this.movies = movies;
    }

    @Override
    public Iterator makeIterator() { 
        return new ListMovieIterator(movies);
    }
}

