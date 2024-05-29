import java.util.*;



public class Main {
    private static Scanner scanner = new Scanner(System.in);
    static List<Book> listOfBooks = new ArrayList<>();

    private static void searchForBookByTitle(String bookTitle) {
        for (Book book : listOfBooks ) {
            if (book.getTitle() == bookTitle) { //couldve also used s1.equalsIgnoreCase(s2) for case insensitive comparison
                System.out.println("This book exists");
                book.printDetails();
            }
        }
    }

    private static void displayAllBooks() {
        System.out.println("Displaying all books:");
        for (Book book : listOfBooks) {
            System.out.println("Book " + (listOfBooks.indexOf(book) + 1) + ":");
            book.printDetails();
        }
    }

    private static void addNewBook() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the book's name: ");
        String bookName = scanner1.nextLine();

        System.out.println("Enter the author's name: ");
        String author = scanner1.nextLine();

        System.out.println("Enter the genre (1 = Fiction, 2 = Science Fiction, 3 = Mystery, 4 = Romance");

        int genreSelector = scanner1.nextInt();
        Genre genre;
        genre = Genre.values()[genreSelector - 1];

        System.out.println("Enter your rating: ");
        double rating = scanner1.nextDouble();

        listOfBooks.add(new Book(bookName, author, genre, rating));

    }

    private static void addBookRatings(String bookName) {
        Scanner scanner1 = new Scanner(System.in);
        for (Book book : listOfBooks) {
            if (book.getTitle() == bookName) {
                System.out.println("Add a rating to " + book.getTitle());
                double rating = scanner1.nextDouble();
                book.ratingsList.add(rating);
                book.updateAverageRating();
                return;
            }
        }

        System.out.println("This book doesn't exist.");
    }

    public static void main(String[] args) {

        listOfBooks . add ( new Book ( "To Kill a Mockingbird" , " Harper Lee " , Genre .
                FICTION, 4.0 ) ) ;
        listOfBooks . add ( new Book ( "1984" , " George Orwell " , Genre . SCIENCE_FICTION, 4.2
        ));
        listOfBooks . add ( new Book ( "The Great Gatsby" , " F . Scott Fitzgerald " ,
                Genre . ROMANCE, 4.1 ) ) ;

        MenuOption selectedOption;

        do {
            displayMenu();
            int option = scanner.nextInt();

            selectedOption = MenuOption.values()[option - 1];

            switch(selectedOption) {
                case MenuOption.ADD_NEW_BOOK:
                    addNewBook();
                    break;
                case MenuOption.SEARCH_FOR_BOOK:
                    searchForBookByTitle("To Kill a Mockingbird");
                    break;
                case MenuOption.DISPLAY_ALL_BOOKS:
                    displayAllBooks();
                    break;
                case MenuOption.EXIT:
                    System.out.println("Exiting program.");
                    break;
                case MenuOption.ADD_RATINGS:
                    addBookRatings("To Kill a Mockingbird");
                default:
                    System.out.println("Invalid Option.");
                    break;
            }
        } while (selectedOption != MenuOption.EXIT);
    }

    private static void displayMenu() {
        System . out . println ( " Choose an option : " ) ;
        System . out . println ( " 1. Add a new book " ) ;
        System . out . println ( " 2. Search for a book " ) ;
        System . out . println ( " 3. Display all books " ) ;
        System . out . println ( " 4. Add ratings to a book " ) ;
        System . out . println ( " 5. Exit " ) ;
    }








}




