package Menu.User;

import Menu.UserView;

import java.util.Scanner;

public class ShowProduct {
    public static void showProducts(){

        boolean end = true;
        do {
            System.out.println("============== PRODUCT==============");
            System.out.println("*                     1. PRODUCT LIST                    *");
            System.out.println("*                     2. Turn Back                            *");
            System.out.println("*                                                                      *");
            System.out.println("=====================================");
            System.out.print(" ⭆ ");
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    System.out.println("PRODUCT LIST ");
                    break;
                case 2:
                    end = false;
                    break;
                default:
                    System.out.println("Chose agian please.(chose 1 or 2) ");
            }
        }while (end);
    }
}
