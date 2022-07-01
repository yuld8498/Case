package Menu.User.Function.User;

import java.util.HashMap;
import java.util.Scanner;

public class UserCreate {
    public static void createUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID: ");
        String ID = scanner.nextLine();
        String pw = StrongPw();
        HashMap<String, String> account = new HashMap<String, String>();
        account.put(ID, pw);
    }

    private static String StrongPw() {
        int passwordLength = 8, upChars = 0, lowChars = 0;
        int special = 0, digits = 0;
        char ch;
        String realPw;
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Enter the Password: ");
            String password = s.nextLine();

            int total = password.length();
            if (total < passwordLength) {
                realPw = null;
                System.out.println("The Password is invalid!");
                System.out.println(password);
            }else {
                for (int i = 0; i < total; i++) {
                    ch = password.charAt(i);
                    if (Character.isUpperCase(ch))
                        upChars = 1;
                    else if (Character.isLowerCase(ch))
                        lowChars = 1;
                    else if (Character.isDigit(ch))
                        digits = 1;
                    else
                        special = 1;
                }

                if (upChars == 1 && lowChars == 1 && digits == 1 && special == 1){
                    realPw = password;
                    System.out.println("Create new User is succesfully.");
                    return realPw;
                }else {
                    realPw = null;
                    System.out.println("The password is Weak.");
                }
            }
        }while (realPw == null);
        return realPw;
    }
}

