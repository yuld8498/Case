package tvt.libaryManagement.view;

import tvt.libaryManagement.model.Product;
import tvt.libaryManagement.service.OrderService;
import tvt.libaryManagement.service.ProductServer;

import java.util.Scanner;

public class AdminView {
    private ProductView productView;
    OrderService orderService;
    private ProductServer productServer;

    public AdminView(){
        productView = new ProductView();
        orderService =new OrderService();
        productServer = new ProductServer();
    }
    public void showAdminView() {
        boolean repeat = true;
        do {
            System.out.print(
                    "✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡ ADMIN ✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡\n" +
                            "✡✡                        1. Manager User                                               ✡✡\n" +
                            "✡✡                        2. Manager Order                                             ✡✡\n" +
                            "✡✡                        3. Manager product                                         ✡✡\n" +
                            "✡✡                        4. Log out                                                          ✡✡\n" +
                            "✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡\n" +
                            "Enter you chose: " + " => ");
            Scanner scanne = new Scanner(System.in);
            int chose = Integer.parseInt(scanne.nextLine());
            switch (chose) {
                case 1:
                case 2:
//                    productServer.orderList();
                for (Product product : orderService.orderList()){
                    System.out.println(product.toString());
                }
                    break;
                case 3:productView.ShowMenu();
                    break;
                case 4:
                    repeat =false;
                    break;
                default:
                    System.out.println("Chose again: ");
            }
        }while (repeat);
    }
}
