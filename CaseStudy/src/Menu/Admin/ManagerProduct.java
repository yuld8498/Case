package Menu.Admin;

import Menu.AdminView;
import Menu.UserView;

import java.util.Scanner;

public class ManagerProduct {
    public static void managerProduct(){

        boolean end = true;
        do {
            System.out.println("========= MANAGER PRODUCT =========");
            System.out.println("*               1. Add New Product                     *");
            System.out.println("*               2. Delete Product                         *");
            System.out.println("*               3. Show Product List                    *");
            System.out.println("*               4. Turn Back                                  *");
            System.out.println("=====================================");
            System.out.print(" ⭆ ");
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Add New Product ");
                    break;
                case 2:
                    System.out.println("Delete Product   ");
                    break;
                case 3:
                    System.out.println("Show Product List  ");
                    break;
                case 4:
                    end =false;
                    break;
                default: System.out.println("Chose agian please.(chose 1, 2, 3 or 4) ");
            }
        }while (end);
    }
}
