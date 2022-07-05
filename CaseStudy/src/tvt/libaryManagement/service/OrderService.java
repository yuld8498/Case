package tvt.libaryManagement.service;

import tvt.libaryManagement.model.Product;
import tvt.libaryManagement.view.LoginView;
import tvt.libaryManagement.view.ProductView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderService {
    ArrayList<Product> oderList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    ProductServer productServer;

    public OrderService() {
        productServer = new ProductServer();
    }

    public List<Product> orderList() {
        return oderList;
    }


    public void showProductList() {
        for (Product product : productServer.findAll()) {
            System.out.println(product.toString());

        }
    }

    public void showOrderList() {
        if (orderList().isEmpty()) {
            System.out.println("Order list is empty, please add product in order");
            return;
        }
        for (Product product : orderList()) {
            System.out.println(product.toString());
        }
    }

    public void addProduct() {
        Product productAdd = new Product();
        System.out.println("Enter ID of product: ");
        long id = Long.parseLong(scanner.nextLine());
        Product product = new Product();
        product = productServer.findAProductByID(id);
        if (product == null) {
            return;
        }
        productAdd.setProductID(product.getProductID());
        productAdd.setProductPrice(product.getProductPrice());
        productAdd.setAuthor(product.getAuthor());
        productAdd.setCategory(product.getCategory());
        productAdd.setProductName(product.getProductName());
        productAdd.setProductQuaility(product.getProductQuaility());
        System.out.println("Enter Quaility: ");
        int quaility = Integer.parseInt(scanner.nextLine());
        if (quaility > product.getProductQuaility()) {
            System.out.println("Quaility is not accept.");
            return;
        } else {
            for (Product product1 : orderList()) {
                if (product1.getProductID() == product.getProductID()) {
                    if (product1.getProductQuaility() + quaility > product.getProductQuaility()) {
                        System.out.println("quaility is not available");
                        return;
                    }
                    if (product1.getProductQuaility() + quaility <= product.getProductQuaility()) {
                        product1.setProductQuaility(product1.getProductQuaility() + quaility);
                        System.out.println("Add is success.");
                        for (Product product3 : orderList()) {
                            System.out.println(product3.toString());
                        }
                        return;
                    }
                }
            }
            productAdd.setProductQuaility(quaility);
            orderList().add(productAdd);
            for (Product product3 : orderList()) {
                System.out.println(product3.toString());
            }
            System.out.println("Add is success.");
        }
    }

    public void deleteOrderByID(long ID) {
        for (Product product : orderList()) {
            if (product.getProductID() == ID) {
                System.out.println("Enter quaility delete: ");
                int quail = Integer.parseInt(scanner.nextLine());
                if (quail > product.getProductQuaility()) {
                    System.out.println("Quaility is not available.");
                    return;
                }
                product.setProductQuaility(product.getProductQuaility() - quail);
                if (product.getProductQuaility() == 0) {
                    oderList.remove(product);
                    System.out.println("Deleted product ID " + product.getProductID() + ", name: " + product.getProductName());
                    return;
                }
                System.out.println("ID: " + product.getProductID() + " Name: " + product.getProductName());
                System.out.println("quantity of remaining product: " + product.getProductQuaility());
                return;
            }

        }
        System.out.println("Can't find this ID, please check again");
    }

    public void printOrder() {
        int result = 0;
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        for (Product product : orderList()) {
            System.out.println(product.toString());
            result += (product.getProductPrice() * product.getProductQuaility());
        }
        System.out.print("Total: ");
        System.out.printf(formatter.format(result) + " VNĐ" + "\n");
        for (Product product1 : orderList()) {
            for (Product product2 : productServer.findAll()) {
                int number = product1.getProductQuaility();
                if (product2.getProductID() == product1.getProductID()) {
                    product2.setProductQuaility(product2.getProductQuaility() - number);
                }
            }
            product1.setProductQuaility(0);
        }
    }
}
