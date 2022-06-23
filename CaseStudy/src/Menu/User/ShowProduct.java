package Menu.User;

import Menu.UserView;

import java.util.Scanner;

public class ShowProduct {
    public static void showProducts(){
        System.out.println("============== PRODUCT==============");
        System.out.println("*                     1. PRODUCT LIST                    *");
        System.out.println("*                     2. Turn Back                            *");
        System.out.println("*                                                                      *");
        System.out.println("=====================================");
        System.out.print(" ⭆ ");

        boolean end = false;
        do {
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    System.out.println("PRODUCT LIST ");
                    break;
                case 2:
                    UserView.userView();
                    UserView.youPick();
                    break;
                default:
                    System.out.println("Chose agian please.(chose 1 or 2) ");
                    end = true;
            }
        }while (end);
    }
}
