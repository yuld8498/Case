package Menu.Admin;

import Menu.AdminView;
import Menu.UserView;

import java.util.Scanner;

public class ManagerOrder {
    public static void managerOrder(){

        boolean end = true;
        do {
            System.out.println("==========  MANAGER ORDER ==========");
            System.out.println("*               1. Show Order List                        *");
            System.out.println("*               2. Add new Order                         *");
            System.out.println("*               3. Delete Order                             *");
            System.out.println("*               4. Turn Back                                  *");
            System.out.println("=====================================");
            System.out.print(" ⭆ ");
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Show Order List ");
                    break;
                case 2:
                    System.out.println("Add new Order ");
                    break;
                case 3:
                    System.out.println("Delete Order ");
                    break;
                case 4:
                    end =false;
                    break;
                default: System.out.println("Chose agian please.(chose 1, 2, 3 or 4) ");
            }
        }while (end);
    }
}
