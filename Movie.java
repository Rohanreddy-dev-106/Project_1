public class Movie {
    private String title;
    private String description;
    private String genre;
    private double rating;
    private int year;
    
    public Movie(String title, String description, String genre, double rating, int year) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.rating = rating;  
        this.year = year;
    }
    
    // Getters
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getGenre() { return genre; }
    public double getRating() { return rating; }
    public int getYear() { return year; }
    
    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setRating(double rating) { this.rating = rating; }
    public void setYear(int year) { this.year = year; }
    
    @Override
    public String toString() {
        return String.format("%-20s | %-4.1f | %-6d | %-12s", title, rating, year, genre);
    }
    
    public String getDetailedInfo() {
        return String.format("Title: %s\nDescription: %s\nGenre: %s\nRating: %.1f/10\nYear: %d", 
                           title, description, genre, rating, year);
    }
}