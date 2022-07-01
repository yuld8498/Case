package Menu.User;

import Menu.Admin.ManagerOrder;
import Menu.Admin.ManagerProduct;
import Menu.Admin.ManagerUser;
import Menu.HomePage;
import Menu.UserView;

import java.util.Scanner;

public class ManagerInfo {
    public static void Infomation(){

        boolean end = true;
        do {
            System.out.println("============= INFOMATION============");
            System.out.println("*               1. Change Infomation                  *");
            System.out.println("*               2. Add Infomation                        *");
            System.out.println("*               3. Delete Infomation                    *");
            System.out.println("*               4. Turn back                                  *");
            System.out.println("=====================================");
            System.out.print(" ⭆ ");
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Change infomation");
                    break;
                case 2:
                    System.out.println("Add infomation");
                    break;
                case 3:
                    System.out.println("Delete infomation");
                    break;
                case 4:
                    end = false;
                    break;
                default: System.out.println("Chose agian please.(chose 1, 2, 3 or 4) ");
                end = true;
                break;
            }
        }while (end);
    }
}
