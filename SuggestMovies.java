public class SuggestMovies {

    Node<String, String, Integer, String> head;
    public SuggestMovies() {
        // Creating 10 movie nodes
        Node<String, String, Integer, String> movie1 = new Node<>("Inception", "A thief enters dreams to steal secrets.", 2010, "Sci-Fi");
        Node<String, String, Integer, String> movie2 = new Node<>("Interstellar", "Explorers travel through a wormhole in space.", 2014, "Sci-Fi");
        Node<String, String, Integer, String> movie3 = new Node<>("The Dark Knight", "Batman faces the Joker in Gotham.", 2008, "Action");
        Node<String, String, Integer, String> movie4 = new Node<>("Titanic", "A love story on the ill-fated Titanic.", 1997, "Romance");
        Node<String, String, Integer, String> movie5 = new Node<>("Avatar", "Humans explore Pandora and clash with Na'vi.", 2009, "Fantasy");
        Node<String, String, Integer, String> movie6 = new Node<>("The Matrix", "A hacker discovers reality is a simulation.", 1999, "Sci-Fi");
        Node<String, String, Integer, String> movie7 = new Node<>("Gladiator", "A Roman general seeks revenge.", 2000, "Action");
        Node<String, String, Integer, String> movie8 = new Node<>("Avengers: Endgame", "Heroes unite to defeat Thanos.", 2019, "Superhero");
        Node<String, String, Integer, String> movie9 = new Node<>("Forrest Gump", "The life journey of a simple man.", 1994, "Drama");
        Node<String, String, Integer, String> movie10 = new Node<>("Joker", "A failed comedian descends into madness.", 2019, "Drama");

        // Linking nodes
        movie1.next = movie2;
        movie2.next = movie3;
        movie3.next = movie4;
        movie4.next = movie5;
        movie5.next = movie6;
        movie6.next = movie7;
        movie7.next = movie8;
        movie8.next = movie9;
        movie9.next = movie10;
        movie10.next=null;
        head = movie1;
    }

  public void printRecommendedMoviesList() {
    Node<String, String, Integer, String> current = head;
    System.out.println("+----------------------+-------+----------------+");
    System.out.println("|        Title         | Year  |      Genre     |");
    System.out.println("+----------------------+-------+----------------+");

    while (current != null) {
        System.out.printf("| %-20s | %-5d | %-14s |\n",
                current.title, current.year, current.genre);
        current = current.next;
    }

    System.out.println("+----------------------+-------+----------------+");
}


 
    
}
