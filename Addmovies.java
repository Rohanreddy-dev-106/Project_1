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

    public void displaymovies() {
        System.out.print("{");
        for (T movie : movies) {
            System.out.print(movie + " ");
        }
        System.out.print("}");
    }

    public T getMoviesInfo(int index) {
        return info.get(index);
    }

}
