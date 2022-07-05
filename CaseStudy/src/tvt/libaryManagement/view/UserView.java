package tvt.libaryManagement.view;

import tvt.libaryManagement.model.Product;
import tvt.libaryManagement.service.OrderService;

import java.util.List;
import java.util.Scanner;

public class UserView {
    OrderService orderService;

    public UserView() {
        orderService = new OrderService();
    }

    public void showUserView() {
        boolean repeat = true;
        do {
            System.out.print(
                    "✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡ USER ✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡\n" +
                            "✡✡                        1. Manager User Infomation                        ✡✡\n" +
                            "✡✡                        2. Add a Product to list order                       ✡✡\n" +
                            "✡✡                        3. Show my Order                                         ✡✡\n" +
                            "✡✡                        4. Show product                                            ✡✡\n" +
                            "✡✡                        5. Delete order by ID                                     ✡✡\n" +
                            "✡✡                        6. Print Order                                                 ✡✡\n" +
                            "✡✡                        7. Log out                                                       ✡✡\n" +
                            "✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡\n" +
                            "Enter you chose: " +
                            " => ");
            Scanner scanne = new Scanner(System.in);
            int chose = Integer.parseInt(scanne.nextLine());
            switch (chose) {
                case 1:
                case 2:
                    orderService.addProduct();
                    break;
                case 3:
                    orderService.showOrderList();
                    break;
                case 4:
                    orderService.showProductList();
                    break;
                case 5:
                    System.out.println("Enter ID: ");
                    long ID = Long.parseLong(scanne.nextLine());
                    orderService.deleteOrderByID(ID);
                    break;
                case 6:
                    orderService.printOrder();
                    break;
                case 7:
                    repeat = false;
                    break;
                default:
                    System.out.println("Please chose: ");
            }
        } while (repeat);
    }
}
