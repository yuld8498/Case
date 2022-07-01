package Menu;

import Menu.Admin.ManagerOrder;
import Menu.Admin.ManagerProduct;
import Menu.Admin.ManagerUser;

import java.util.Scanner;

public class AdminView {
    public static void Account(){
        Scanner scanner =new Scanner(System.in);
        boolean realID = true;
        do {
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Password: ");
            String pw = scanner.nextLine();
            if (id.equals("Admin")&&pw.equals("Admin")){
                realID = false;
                Adminview();
            }
        }while (realID);
    }
    public static void Adminview() {

                boolean end = true;
               do {
                   System.out.println("=============== ADMIN ===============");
                   System.out.println("*               1. Manager User                           *");
                   System.out.println("*               2. Manager produc                      *");
                   System.out.println("*               3. Manager order                         *");
                   System.out.println("*               4. Log out                                      *");
                   System.out.println("=====================================");
                   System.out.print(" ⭆ ");
                   Scanner scanner = new Scanner(System.in);
                   int chose = scanner.nextInt();
                   switch (chose){
                       case 1:
                           ManagerUser.managerUser();
                           break;
                       case 2:
                           ManagerProduct.managerProduct();
                           break;
                       case 3:
                           ManagerOrder.managerOrder();
                           break;
                       case 4:
                           end = false;
                           break;
                       default: System.out.println("Chose agian please.(chose 1, 2, 3 or 4) ");
                   }
               }while (end);
    }
}
