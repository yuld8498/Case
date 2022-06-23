package Menu;

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
                System.out.println("=============== ADMIN ===============");
                System.out.println("*               1. Manager User                           *");
                System.out.println("*               2. Manager produc                      *");
                System.out.println("*               3. Manager order                         *");
                System.out.println("*               4. Log out                                      *");
                System.out.println("=====================================");
                System.out.print(" ⭆ ");
    }
}
