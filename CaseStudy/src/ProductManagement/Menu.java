package ProductManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {
    public static void Adminview() {
        ArrayList<Book> list = new ArrayList<Book>(BooksList.Bookslist());
        boolean end = true;
        do {
            System.out.println("=============== Menu  ===============");
            System.out.println("*               1. Add a Book                               *");
            System.out.println("*               2. Edit a book                               *");
            System.out.println("*               3. Remove a Book                        *");
            System.out.println("*               4. Print a list book                        *");
            System.out.println("*               5. Find a book by name               *");
            System.out.println("*               6. Sort by Price low to high          *");
            System.out.println("*               7. Sort by Price high to low          *");
            System.out.println("=====================================");
            System.out.print(" ⭆ ");
            Scanner scanner = new Scanner(System.in);
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose) {
                case 1:
                    list.add(BooksList.createANewBook());
                    break;
                case 2:
                    System.out.println("Enter the ID to be corrected : ");
                    int Id = scanner.nextInt();
                    int index = 0;
                    for (Book bookchange : list) {
                        if (bookchange.getID() == Id){
                            list.set(index, BooksList.createANewBook());
                        }
                        index +=1;
                    }
                    break;
                case 3:
                    System.out.println("Enter the ID to be delete : ");
                    int number = scanner.nextInt();
                    int ind = 0;
                    int thisnumber=0;
                    for (Book bookDel : list){
                        if (bookDel.getID() == number){
                            thisnumber = ind;
                        }
                        ind++;
                    }
                    list.remove(thisnumber);
                    break;
                case 4:
                    Collections.sort(list, new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return o1.getID() - o2.getID();
                        }
                    });
                    for (Book a : list) {
                        System.out.println(a.toString());
                    }
                    break;
                case 5:
                    System.out.println("Enter the name to be find : ");
                    String name = scanner.nextLine();
                    for (Book bookFind : list){
                        if (bookFind.getName().equals(name)){
                            System.out.println(bookFind.toString());
                        }
                    }
                    break;
                case 6:
                    Collections.sort(list, new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return o1.getPrice() - o2.getPrice();
                        }
                    });
                    for (Book a : list) {
                        System.out.println(a.toString());
                    }
                    break;
                case 7:
                    Collections.sort(list, new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return o2.getPrice() - o1.getPrice();
                        }
                    });
                    for (Book a : list) {
                        System.out.println(a.toString());
                    }
                    break;
                default:
                    System.out.println("Chose agian please.(chose 1, 2, 3 or 4) ");
            }
        } while (end);
    }
}
