import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks . add ( new Book ( " To Kill a Mockingbird " , " Harper Lee " , Genre .
                FICTION ) ) ;
        listOfBooks . add ( new Book ( " 1984 " , " George Orwell " , Genre . SCIENCE_FICTION
        ));
        listOfBooks . add ( new Book ( " The Great Gatsby " , " F . Scott Fitzgerald " ,
                Genre . ROMANCE ) ) ;

        writeBookstoFile(listOfBooks);

        List < Book > storedBooks = readBooksFromFile () ;
        if ( storedBooks != null ) {
            for ( Book book : storedBooks ) {
                book.printDetails();
            }
        }

    }

    private static void writeBookstoFile(List<Book> listOfBooks) {
        try {
            FileWriter writingFile = new FileWriter("BookInfo.txt", true);

            for (Book book : listOfBooks) {
                writingFile.write(book.getTitle() + ',' + book.getAuthor() + ',' + book.getGenre() + "\n");
            }

            writingFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }


    public static List<Book> readBooksFromFile() {
        List<Book> bookList = new ArrayList<>();
        try {
            File readingFile = new File("BookInfo.txt");
            Scanner dataReader = new Scanner(readingFile);

            while (dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();
                String[] parts = fileData.split(",");

                if (parts.length == 3) {
                    String title = parts[0].trim();
                    String author = parts[1].trim();
                    Genre genre = Genre.valueOf(parts[2]);
                    bookList.add(new Book(title, author, genre));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return bookList;

    }

}