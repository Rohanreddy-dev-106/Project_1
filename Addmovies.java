import java.util.ArrayList;
import java.util.Scanner;

public class Addmovies<T> {
    ArrayList<T> movies;
    ArrayList<T> info;

    public Addmovies() {
        movies = new ArrayList<>();
        info = new ArrayList<>();
    }

    public void addMovie(T movie) {
        movies.add(movie);
    }

    public void addInfo(T information) {
        info.add(information);
    }

    public void displayMovies() {
    // Top border
    System.out.println("+----------------------+");
    System.out.println("|       Movies         |");
    System.out.println("+----------------------+");

    for (T movie : movies) {
        System.out.printf("| %-20s |\n", movie);  // Left-aligned in 20-char width
    }

    // Bottom border
    System.out.println("+----------------------+");
}


    public T getMoviesInfo(int index) {
        return info.get(index);
    }

}
