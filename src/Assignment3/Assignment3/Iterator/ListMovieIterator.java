package Iterator;

import java.util.List;

public class ListMovieIterator implements Iterator {
    private List<String> movies;
    private int index;

    public ListMovieIterator(List<String> movies) {
        this.movies = movies;
        this.index = 0;
    }

    @Override
    public boolean hasMore() { 
        return index < movies.size();
    }

    @Override
    public String getNext() { 
        if (this.hasMore()) {
            return movies.get(index++);
        }
        return null;
    }
}
