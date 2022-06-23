package Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HomePage.login();
        boolean trust = false;
       do {
           int youChose = scanner.nextInt();
           switch (youChose){
               case 1: AdminView.Account();
               break;
               case 2: UserView.userView();
               break;
               case 3:CreateUser.CreateUser();
               break;
               default:
                   System.out.println("Chose agian please.(chose 1, 2 or 3) ");
                   trust = true;
           }
       }while (trust);
    }
}
