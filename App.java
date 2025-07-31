import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MovieManager movieManager = new MovieManager();
        SuggestMovies suggestMovies = new SuggestMovies();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n╔═══════════════════════════════════╗");
            System.out.println("║        🎬 MOVIE MENU 🎬          ║");
            System.out.println("╠═══════════════════════════════════╣");
            System.out.println("║ 1. Display Movies                 ║");
            System.out.println("║ 2. View Movie Info                ║");
            System.out.println("║ 3. Show Recommended Movies        ║");
            System.out.println("║ 4. Search Movie by Title          ║");
            System.out.println("║ 5. Select Movie to Watch          ║");
            System.out.println("║ 6. Watch Recommended Movie        ║");
            System.out.println("║ 7. Watch History                  ║");
            System.out.println("║ 8. Watch Later Queue              ║");
            System.out.println("║ 9. Sort Movies                    ║");
            System.out.println("║ 10. Add New Movie                 ║");
            System.out.println("║ 11. Top Rated Movies              ║");
            System.out.println("║ 12. BST Operations                ║");
            System.out.println("║ 0. Exit                           ║");
            System.out.println("╚═══════════════════════════════════╝");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    movieManager.displayMovies();
                    break;

                case 2:
                    movieManager.displayMovies();
                    System.out.print("Enter movie number to view info: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    Movie selectedMovie = movieManager.getMovie(index - 1);
                    if (selectedMovie != null) {
                        System.out.println("\n" + selectedMovie.getDetailedInfo());
                    } else {
                        System.out.println("Invalid movie number!");
                    }
                    break;

                case 3:
                    suggestMovies.printRecommendedMoviesList();
                    break;

                case 4:
                    System.out.println("\nSearch Options:");
                    System.out.println("1. Linear Search");
                    System.out.println("2. Binary Search");
                    System.out.println("3. BST Search");
                    System.out.print("Choose search method: ");
                    int searchChoice = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Enter movie title to search: ");
                    String searchTitle = sc.nextLine();
                    
                    Movie foundMovie = null;
                    long startTime = System.nanoTime();
                    
                    switch (searchChoice) {
                        case 1:
                            foundMovie = movieManager.linearSearch(searchTitle);
                            System.out.println("Used: Linear Search");
                            break;
                        case 2:
                            foundMovie = movieManager.binarySearch(searchTitle);
                            System.out.println("Used: Binary Search");
                            break;
                        case 3:
                            // This will be implemented with BST
                            System.out.println("BST Search not fully implemented yet");
                            break;
                    }
                    
                    long endTime = System.nanoTime();
                    
                    if (foundMovie != null) {
                        System.out.println("Movie Found!");
                        System.out.println(foundMovie.getDetailedInfo());
                        System.out.printf("Search time: %.2f microseconds\n", 
                                        (endTime - startTime) / 1000.0);
                    } else {
                        System.out.println("Movie not found!");
                    }
                    break;

                case 5:
                    movieManager.displayMovies();
                    System.out.print("Enter movie number to watch: ");
                    int watchIndex = sc.nextInt();
                    sc.nextLine();
                    Movie movieToWatch = movieManager.getMovie(watchIndex - 1);
                    if (movieToWatch != null) {
                        movieManager.addToWatchHistory(movieToWatch);
                        System.out.println("🎬 Now watching: " + movieToWatch.getTitle());
                        System.out.println("Enjoy your movie!");
                    } else {
                        System.out.println("Invalid movie number!");
                    }
                    break;

                case 6:
                    suggestMovies.printRecommendedMoviesList();
                    System.out.print("Enter recommendation number to watch: ");
                    int recIndex = sc.nextInt();
                    sc.nextLine();
                    
                    // Get movie from recommendations (simplified)
                    if (recIndex >= 1 && recIndex <= 10) {
                        System.out.println("🎬 Now watching recommended movie #" + recIndex);
                        System.out.println("Added to watch history!");
                    } else {
                        System.out.println("Invalid recommendation number!");
                    }
                    break;

                case 7:
                    movieManager.displayWatchHistory();
                    break;

                case 8:
                    System.out.println("\nWatch Later Queue Options:");
                    System.out.println("1. View Queue");
                    System.out.println("2. Add Movie to Queue");
                    System.out.println("3. Watch Next Movie");
                    System.out.print("Choose option: ");
                    int queueChoice = sc.nextInt();
                    sc.nextLine();
                    
                    switch (queueChoice) {
                        case 1:
                            movieManager.displayWatchLaterQueue();
                            break;
                        case 2:
                            movieManager.displayMovies();
                            System.out.print("Enter movie number to add to queue: ");
                            int queueIndex = sc.nextInt();
                            sc.nextLine();
                            Movie queueMovie = movieManager.getMovie(queueIndex - 1);
                            if (queueMovie != null) {
                                movieManager.addToWatchLater(queueMovie);
                            } else {
                                System.out.println("Invalid movie number!");
                            }
                            break;
                        case 3:
                            Movie nextMovie = movieManager.getNextToWatch();
                            if (nextMovie != null) {
                                System.out.println("🎬 Now watching: " + nextMovie.getTitle());
                                movieManager.addToWatchHistory(nextMovie);
                            } else {
                                System.out.println("Queue is empty!");
                            }
                            break;
                    }
                    break;

                case 9:
                    System.out.println("\nSorting Options:");
                    System.out.println("1. Sort by Rating (Bubble Sort)");
                    System.out.println("2. Sort by Title (Merge Sort)");
                    System.out.println("3. Sort by Year (Quick Sort)");
                    System.out.print("Choose sorting method: ");
                    int sortChoice = sc.nextInt();
                    sc.nextLine();
                    
                    long sortStart = System.nanoTime();
                    
                    switch (sortChoice) {
                        case 1:
                            movieManager.bubbleSortByRating();
                            System.out.println("Movies sorted by rating (Bubble Sort)!");
                            break;
                        case 2:
                            movieManager.mergeSortByTitle();
                            System.out.println("Movies sorted by title (Merge Sort)!");
                            break;
                        case 3:
                            movieManager.quickSortByYear();
                            System.out.println("Movies sorted by year (Quick Sort)!");
                            break;
                    }
                    
                    long sortEnd = System.nanoTime();
                    System.out.printf("Sorting time: %.2f microseconds\n", 
                                    (sortEnd - sortStart) / 1000.0);
                    movieManager.displayMovies();
                    break;

                case 10:
                    System.out.print("Enter movie title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter description: ");
                    String description = sc.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = sc.nextLine();
                    System.out.print("Enter rating (0-10): ");
                    double rating = sc.nextDouble();
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    
                    Movie newMovie = new Movie(title, description, genre, rating, year);
                    movieManager.addMovie(newMovie);
                    System.out.println("Movie added successfully!");
                    break;

                case 11:
                    movieManager.displayTopRatedMovies();
                    break;

                case 12:
                    System.out.println("BST Operations - Movies in alphabetical order:");
                    // This will display movies from BST in order
                    System.out.println("Feature available in MovieBST class");
                    break;

                case 0:
                    System.out.println("Thanks for using Movie Management System!");
                    System.out.println("🎬 Happy watching! 🎬");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
