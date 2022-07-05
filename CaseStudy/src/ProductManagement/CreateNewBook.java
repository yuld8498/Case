package ProductManagement;

import java.util.Scanner;

public class CreateNewBook {
    public static Book createANewBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input book name: ");
        String name = sc.nextLine();
        System.out.println("input name of author: ");
        String author = sc.nextLine();
        System.out.println("input category of book: ");
        String category = sc.nextLine();
        System.out.println("input price of book(VND): ");
        int price = sc.nextInt();
        System.out.println("input number of book available: ");
        int amount = sc.nextInt();
        System.out.println("input ID: ");
        int ID = sc.nextInt();
        Book book = new Book(ID,name, category, author, price, amount);
        return book;
    }
}
