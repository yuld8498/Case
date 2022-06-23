package Menu.Admin;

import Menu.AdminView;

import java.util.Scanner;

public class ManagerUser {
    public static void managerUser(){
        System.out.println("=========== MANAGER USER ===========");
        System.out.println("*               1. Add New User                           *");
        System.out.println("*               2. Delete User                               *");
        System.out.println("*               3. Show User List                          *");
        System.out.println("*               4. Turn Back                                  *");
        System.out.println("=====================================");
        System.out.print(" ⭆ ");
        boolean end = false;
        do {
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Add New User   ");
                    break;
                case 2:
                    System.out.println("Delete User       ");
                    break;
                case 3:
                    System.out.println("Show User List   ");
                    break;
                case 4:
                    AdminView.Adminview();
                    break;
                default: System.out.println("Chose agian please.(chose 1, 2, 3 or 4) ");
                    end = true;
            }
        }while (end);
    }

}
