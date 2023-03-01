package libraryApp;

public class Library {
    Book[] bookList = new Book[100];
    int numberOfBooksAdded;


    public void printBooks() {
        for (int i = 0; i < numberOfBooksAdded; i++) {
            System.out.println(bookList[i]);
        }
    }

    public boolean addBook(Book book) {
        bookList[numberOfBooksAdded] = book;
        numberOfBooksAdded++;
        return true;
    }

    public String[] findBooksByAuthor(String author) {
        String[] foundBooks = new String[numberOfBooksAdded];
        int numberOfFoundBooksAdded = 0;
        for (int i = 0; i < numberOfBooksAdded; i++) {
            if (bookList[i].author.contains(author)) {
                foundBooks[numberOfFoundBooksAdded] = bookList[i].title;
                numberOfFoundBooksAdded++;
            }
        }
        return foundBooks;
    }
}


