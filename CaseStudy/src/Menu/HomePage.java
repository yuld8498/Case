package Menu;

import java.util.Scanner;

public class HomePage {
    public static void login() {
        System.out.println("=============== LOGIN================");
        System.out.println("*               1. Login by Admin                        *");
        System.out.println("*               2. Login by User                            *");
        System.out.println("*               3.Create new User                        *");
        System.out.println("=====================================");
        System.out.print(" ⭆ ");
        Scanner scanner = new Scanner(System.in);
        boolean trust = false;
        do {
            int youChose = scanner.nextInt();
            switch (youChose){
                case 1: AdminView.Account();
                    break;
                case 2: UserView.userView();
                    UserView.youPick();
                    break;
                case 3:CreateUser.CreateUser();
                    break;
                default: System.out.println("Chose agian please.(chose 1, 2 or 3) ");
                    trust = true;
            }
        }while (trust);
    }
}
