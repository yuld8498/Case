package Menu;

import Menu.Admin.ManagerOrder;
import Menu.Admin.ManagerProduct;
import Menu.Admin.ManagerUser;
import Menu.User.ManagerInfo;
import Menu.User.ShowProduct;

import java.util.Scanner;

public class UserView {
    public static void youPick() {

        boolean run = true;
        do {
            System.out.println("===============  USER ================");
            System.out.println("*               1. Manager User Infomation       *");
            System.out.println("*               2. Manager my Order                  *");
            System.out.println("*               3. Show product                           *");
            System.out.println("*               4. Log out                                      *");
            System.out.println("=====================================");
            System.out.print(" => ");
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    ManagerInfo.Infomation();
                    break;
                case 2:
                    Menu.User.ManagerOrder.managerOrder();
                    break;
                case 3:
                    ShowProduct.showProducts();
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("Chose agian please.(chose 1, 2, 3 or 4) ");
                    run = true;
                    break;
            }
        } while (run);
    }
}
