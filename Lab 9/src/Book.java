public class Book {
    private String title;
    private String author;
    private Genre genre;

    public Book(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public Book() {}

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void printDetails() {
        System.out.println("Title: " + getTitle() + ", Author: " + getAuthor() + ", Genre: " + getGenre());
    }
}
