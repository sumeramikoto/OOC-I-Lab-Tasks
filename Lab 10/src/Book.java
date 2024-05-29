import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private Genre genre;
    private double averageRating;
    List<Double> ratingsList = new ArrayList<>();

    public Book(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.averageRating = 0;
    }

    public Book(String title, String author, Genre genre, double averageRating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.averageRating = averageRating;
        ratingsList.add(averageRating);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getAverageRating() {
        return averageRating;
    }

    void updateAverageRating() {
        double totalRatings = 0;
        for (Double rating : ratingsList) {
            totalRatings += rating;
        }

        averageRating = totalRatings / ratingsList.size();

    }

    public void printDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " +getGenre());
        System.out.println("Average Ratings: " + getAverageRating());
    }

}
