package Menu;

import java.util.Scanner;

public class HomePage {
    public static void login() {

        boolean trust = true;
        do {
            System.out.println("✡✡✡✡✡✡✡✡✡✡✡  LOGIN ✡✡✡✡✡✡✡✡✡✡✡");
            System.out.println("✡                1. Login by Admin                       ✡");
            System.out.println("✡                2. Login by User                           ✡");
            System.out.println("✡                3.Create new User                       ✡");
            System.out.println("✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡");
            System.out.print(" ⭆ ");
            Scanner scanner = new Scanner(System.in);
            int youChose = scanner.nextInt();
            if (youChose == 8498){
                return;
            }
            switch (youChose) {
                case 1:
                    AdminView.Account();
                    break;
                case 2:
                    UserView.youPick();
                    break;
                case 3:
                    CreateUser.CreateUser();
                    break;
                default:
                    System.out.println("Chose agian please.(chose 1, 2 or 3) ");
                    break;
            }
        } while (trust);
    }
}
