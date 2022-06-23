package Menu.User;

import Menu.UserView;

import java.util.Scanner;

public class ManagerOrder {
    public static void managerOrder(){
        System.out.println("=========== MANAGER ORDER==========");
        System.out.println("*               1. Show my Orde                         *");
        System.out.println("*               2. Add new Order                         *");
        System.out.println("*               3. Delete Order                             *");
        System.out.println("*               4. Turn back                                  *");
        System.out.println("=====================================");
        System.out.print(" ⭆ ");

        boolean end = false;
        do {
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Show my Order");
                    break;
                case 2:
                    System.out.println("Add new Order  ");
                    break;
                case 3:
                    System.out.println("Delete Order");
                    break;
                case 4:
                    UserView.userView();
                    UserView.youPick();
                    break;
                default: System.out.println("Chose agian please.(chose 1, 2, 3 or 4) ");
                end = true;
            }
        }while (end);
    }
}
