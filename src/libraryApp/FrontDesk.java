package libraryApp;

public class FrontDesk {
    public static void main(String[] args) {

        Library library = new Library();
        Book book = new Book("Toba de tinichea", "Gunter Grass", 35);
        Book book1 = new Book("Mica Dorrit ", "Charles Dickesn", 65);
        Book book2 = new Book("Becoming bulletproof", "Evy Poumpouras", 47);

        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.printBooks();

        String[] foundBooks = library.findBooksByAuthor("Gunter Grass");

        for (int i = 0; i < foundBooks.length; i++) {
            if (foundBooks[i] != null) {
                System.out.println(foundBooks[i]);
            } else {
                break;
            }
        }
    }

}
