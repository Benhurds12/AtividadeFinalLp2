package provafinal.br.ufrn.imd.modelecontrole;

import java.util.ArrayList;

public class Catalogue {
    private ArrayList<Book> books;

    public Catalogue() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    
    public double calculateAveragePrice() {
        double totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }
        return totalPrice / books.size();
    }

    public ArrayList<Book> findCheapFictionBooks(double maxPrice) {
        ArrayList<Book> cheapFictionBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isFiction() && book.getPrice() <= maxPrice) {
                cheapFictionBooks.add(book);
            }
        }
        return cheapFictionBooks;
    }
}
