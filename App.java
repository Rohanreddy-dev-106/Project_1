import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Addmovies<String> mov = new Addmovies<>();
        Scanner sc = new Scanner(System.in);

        // Add  movies initially
        mov.addMovie("RRR");
        mov.addInfo("This movie is about friendship and freedom fighters.");
        mov.addMovie("Inception");
        mov.addInfo("A mind-bending thriller directed by Christopher Nolan.");
        mov.addMovie("Interstellar");
        mov.addInfo("A sci-fi journey through space and time.");
        mov.addMovie("KGF");
        mov.addInfo("Action-packed story set in the Kolar Gold Fields.");
        mov.addMovie("3 Idiots");
        mov.addInfo("A college drama that inspires students to follow passion.");

        int choice;
        do {
            System.out.println("\n--- Movie Menu ---");
            System.out.println("1. Display Movies");
            System.out.println("2. View Movie Info");
            System.out.println("3. Show Total Movies");
            System.out.println("4. Search movie by title");
            System.out.println("5. Watch Queue");
            System.out.println("6. Watch History");
            System.out.println("7. Sort movies by rating");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    mov.displaymovies();
                    break;

                case 2:
                    mov.displaymovies();
                    System.out.print("Enter index to view info: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Info: " + mov.getMoviesInfo(index-1));
                    break;

                case 3:
                 
                    break;

                case 4:
                    System.out.print("Enter title to search: ");
                    
                    break;

                case 5:
                    System.out.println("Watch Queue");
                    break;

                case 6:
                    System.out.println("Watch History");
                    break;

                case 7:
                    System.out.println("Sorting by rating");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
