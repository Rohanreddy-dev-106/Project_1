import java.util.*;

public class MovieManager {
    private ArrayList<Movie> movies;
    private Stack<Movie> watchHistory;
    private Queue<Movie> watchLaterQueue;
    private MovieBST movieBST;
    
    public MovieManager() {
        movies = new ArrayList<>();
        watchHistory = new Stack<>();
        watchLaterQueue = new LinkedList<>();
        movieBST = new MovieBST();
        initializeMovies();
    }
    
    private void initializeMovies() {
        // Add initial movies with complete information
        addMovie(new Movie("RRR", "This movie is about friendship and freedom fighters.", "Action", 8.8, 2022));
        addMovie(new Movie("Inception", "A mind-bending thriller directed by Christopher Nolan.", "Sci-Fi", 8.8, 2010));
        addMovie(new Movie("Interstellar", "A sci-fi journey through space and time.", "Sci-Fi", 8.6, 2014));
        addMovie(new Movie("KGF", "Action-packed story set in the Kolar Gold Fields.", "Action", 8.2, 2018));
        addMovie(new Movie("3 Idiots", "A college drama that inspires students to follow passion.", "Comedy", 8.4, 2009));
    }
    
    public void addMovie(Movie movie) {
        movies.add(movie);
        movieBST.insert(movie);
    }
    
    public void displayMovies() {
        System.out.println("+----------------------+------+--------+--------------+");
        System.out.println("|        Title         |Rating| Year   |    Genre     |");
        System.out.println("+----------------------+------+--------+--------------+");
        
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.printf("| %2d. %-16s | %-4.1f | %-6d | %-12s |\n", 
                            i + 1, movie.getTitle(), movie.getRating(), 
                            movie.getYear(), movie.getGenre());
        }
        
        System.out.println("+----------------------+------+--------+--------------+");
    }
    
    public Movie getMovie(int index) {
        if (index >= 0 && index < movies.size()) {
            return movies.get(index);
        }
        return null;
    }
    
    public int getMovieCount() {
        return movies.size();
    }
    
    // Linear Search
    public Movie linearSearch(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;
    }
    
    // Binary Search (movies must be sorted by title first)
    public Movie binarySearch(String title) {
        ArrayList<Movie> sortedMovies = new ArrayList<>(movies);
        sortedMovies.sort((m1, m2) -> m1.getTitle().compareToIgnoreCase(m2.getTitle()));
        
        int left = 0, right = sortedMovies.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = sortedMovies.get(mid).getTitle().compareToIgnoreCase(title);
            
            if (comparison == 0) {
                return sortedMovies.get(mid);
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    
    // Bubble Sort
    public void bubbleSortByRating() {
        int n = movies.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (movies.get(j).getRating() < movies.get(j + 1).getRating()) {
                    Collections.swap(movies, j, j + 1);
                }
            }
        }
    }
    
    // Merge Sort by Title
    public void mergeSortByTitle() {
        movies = mergeSort(movies, "title");
    }
    
    // Quick Sort by Year
    public void quickSortByYear() {
        quickSort(movies, 0, movies.size() - 1, "year");
    }
    
    private ArrayList<Movie> mergeSort(ArrayList<Movie> list, String criteria) {
        if (list.size() <= 1) return list;
        
        int mid = list.size() / 2;
        ArrayList<Movie> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Movie> right = new ArrayList<>(list.subList(mid, list.size()));
        
        left = mergeSort(left, criteria);
        right = mergeSort(right, criteria);
        
        return merge(left, right, criteria);
    }
    
    private ArrayList<Movie> merge(ArrayList<Movie> left, ArrayList<Movie> right, String criteria) {
        ArrayList<Movie> result = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < left.size() && j < right.size()) {
            boolean condition = false;
            switch (criteria) {
                case "title":
                    condition = left.get(i).getTitle().compareToIgnoreCase(right.get(j).getTitle()) <= 0;
                    break;
            }
            
            if (condition) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }
        
        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));
        
        return result;
    }
    
    private void quickSort(ArrayList<Movie> list, int low, int high, String criteria) {
        if (low < high) {
            int pi = partition(list, low, high, criteria);
            quickSort(list, low, pi - 1, criteria);
            quickSort(list, pi + 1, high, criteria);
        }
    }
    
    private int partition(ArrayList<Movie> list, int low, int high, String criteria) {
        int pivot = 0;
        switch (criteria) {
            case "year":
                pivot = list.get(high).getYear();
                break;
        }
        
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            boolean condition = false;
            switch (criteria) {
                case "year":
                    condition = list.get(j).getYear() <= pivot;
                    break;
            }
            
            if (condition) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        
        Collections.swap(list, i + 1, high);
        return i + 1;
    }
    
    // Watch History operations
    public void addToWatchHistory(Movie movie) {
        watchHistory.push(movie);
        System.out.println("Added '" + movie.getTitle() + "' to watch history.");
    }
    
    public void displayWatchHistory() {
        if (watchHistory.isEmpty()) {
            System.out.println("No movies in watch history.");
            return;
        }
        
        System.out.println("\n=== Watch History (Most Recent First) ===");
        Stack<Movie> temp = new Stack<>();
        int count = 1;
        
        while (!watchHistory.isEmpty()) {
            Movie movie = watchHistory.pop();
            System.out.printf("%d. %s (%.1f/10, %d)\n", count++, 
                            movie.getTitle(), movie.getRating(), movie.getYear());
            temp.push(movie);
        }
        
        // Restore the stack
        while (!temp.isEmpty()) {
            watchHistory.push(temp.pop());
        }
    }
    
    // Watch Later Queue operations
    public void addToWatchLater(Movie movie) {
        watchLaterQueue.offer(movie);
        System.out.println("Added '" + movie.getTitle() + "' to watch later queue.");
    }
    
    public void displayWatchLaterQueue() {
        if (watchLaterQueue.isEmpty()) {
            System.out.println("No movies in watch later queue.");
            return;
        }
        
        System.out.println("\n=== Watch Later Queue ===");
        int count = 1;
        for (Movie movie : watchLaterQueue) {
            System.out.printf("%d. %s (%.1f/10, %d)\n", count++, 
                            movie.getTitle(), movie.getRating(), movie.getYear());
        }
    }
    
    public Movie getNextToWatch() {
        return watchLaterQueue.poll();
    }
    
    // Get top-rated movies using Priority Queue
    public void displayTopRatedMovies() {
        PriorityQueue<Movie> topRated = new PriorityQueue<>((m1, m2) -> 
                                        Double.compare(m2.getRating(), m1.getRating()));
        
        topRated.addAll(movies);
        
        System.out.println("\n=== Top Rated Movies ===");
        int count = 1;
        while (!topRated.isEmpty() && count <= Math.min(5, movies.size())) {
            Movie movie = topRated.poll();
            System.out.printf("%d. %s - %.1f/10 (%d)\n", count++, 
                            movie.getTitle(), movie.getRating(), movie.getYear());
        }
    }
}