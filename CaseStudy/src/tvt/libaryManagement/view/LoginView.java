package tvt.libaryManagement.view;

import java.util.Scanner;

public class LoginView {
    AdminView adminView;
    UserView userView;
    public LoginView(){
        adminView =new AdminView();
        userView =new UserView();
    }
    public void showViewLogin() {
        boolean repeat = true;
        do {
            System.out.print(
                    "✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡  LOGIN ✡✡✡✡✡✡✡✡✡✡✡✡\n" +
                            "✡                                                                                  ✡\n" +
                            "✡                             1. Login by Admin                      ✡\n" +
                            "✡                             2. Login by User                          ✡\n" +
                            "✡                             3.Create new User                      ✡\n" +
                            "✡                                                                                  ✡\n" +
                            "✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡\n" +
                            "Enter you chose: "+
                            " ⭆ ");
            Scanner scanne = new Scanner(System.in);
            int chose = Integer.parseInt(scanne.nextLine());
            switch (chose){
                case 1:
                    adminView.showAdminView();
                    break;
                case 2:
                    userView.showUserView();
                    break;
                case 3:
                    repeat =false;
                    break;
                default:
                    System.out.println("Please chose: ");
            }
        }while (repeat);
    }
}
