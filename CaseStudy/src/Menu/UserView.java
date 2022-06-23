package Menu;

import Menu.Admin.ManagerOrder;
import Menu.Admin.ManagerProduct;
import Menu.Admin.ManagerUser;
import Menu.User.ManagerInfo;
import Menu.User.ShowProduct;

import java.util.Scanner;

public class UserView {
    public static void userView(){
        System.out.println("===============  USER ================");
        System.out.println("*               1. Manager User Infomation       *");
        System.out.println("*               2. Manager my Order                  *");
        System.out.println("*               3. Show product                           *");
        System.out.println("*               4. Log out                                      *");
        System.out.println("=====================================");
        System.out.print(" => ");
    }
    public static void youPick(){

        boolean end = false;
        do {
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    ManagerInfo.Infomation();
                    break;
                case 2:
                    Menu.User.ManagerOrder.managerOrder();
                    break;
                case 3:
                    ShowProduct.showProducts();
                    break;
                case 4:HomePage.login();
                    break;
                default: System.out.println("Chose agian please.(chose 1, 2, 3 or 4) ");
                end = true;
            }
        }while (end);
    }
}
