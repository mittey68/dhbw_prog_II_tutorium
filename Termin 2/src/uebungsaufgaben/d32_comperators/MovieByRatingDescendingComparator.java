package uebungsaufgaben.d32_comperators;

import java.util.Comparator;

public class MovieByRatingDescendingComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {
        return Double.valueOf(movie2.rating()).compareTo(movie1.rating());
    }

}