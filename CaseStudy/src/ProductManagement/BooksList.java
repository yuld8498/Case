package ProductManagement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class BooksList {
//    public BooksList(int ID, String name, String category, String author, int price, int amount) {
//        super(ID, name, category, author, price, amount);
//    }

    public static ArrayList<Book> Bookslist() {
        ArrayList<Book> booksList = new ArrayList<>();
        booksList.add(new Book( 52,"harry potter and the philosopher's stone", "J. K. Rowling", "novel,Children's literature,", 120000, 5));
        booksList.add(new Book( 53,"harry potter and chamber of secrets", "J. K. Rowling", "novel,Children's literature,", 220000, 7));
        booksList.add(new Book( 56,"harry potter and Prisoner of Azkaban ", "J. K. Rowling", "novel,Children's literature,", 250000, 6));
        booksList.add(new Book( 59,"harry potter and Goblet of Fire ", "J. K. Rowling", "novel,Children's literature,", 280000, 8));
        booksList.add(new Book( 63,"harry potter and Order of the Phoenix", "J. K. Rowling", "novel,Children's literature,", 340000, 8));
        booksList.add(new Book( 77,"harry potter and Half-Blood Prince", "J. K. Rowling", "novel,Children's literature,", 420000, 7));
        booksList.add(new Book( 86,"harry potter and Deathly Hallows 1", "J. K. Rowling", "novel,Children's literature,", 520000, 5));
        booksList.add(new Book( 96,"harry potter and Deathly Hallows 2", "J. K. Rowling", "novel,Children's literature,", 620000, 5));
        booksList.add(new Book( 102,"Lord of the rings", "J. R. R. Tolkien", "Adventure story,High fantasy", 350000, 6));
        booksList.add(new Book( 177,"The Godfather", "Morio Puzo", "novel", 300000, 5));
        booksList.add(new Book( 188,"Les Miserables", "Victor Hugo", "novel", 420000, 6));
        return booksList;
    }
}
