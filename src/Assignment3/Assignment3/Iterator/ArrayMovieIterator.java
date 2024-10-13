package Iterator;

public class ArrayMovieIterator implements Iterator {
    private String[] movies;
    private int index;

    public ArrayMovieIterator(String[] movies) {
        this.movies = movies;
        this.index = 0;
    }

    @Override
    public boolean hasMore() { 
        return index < movies.length;
    }

    @Override
    public String getNext() { 
        if (this.hasMore()) { 
            return movies[index++];
        }
        return null;
    }
}
