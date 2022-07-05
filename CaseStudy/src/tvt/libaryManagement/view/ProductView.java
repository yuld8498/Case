package tvt.libaryManagement.view;

import tvt.libaryManagement.model.Product;
import tvt.libaryManagement.service.ProductServer;

import java.util.Scanner;

public class ProductView {
    private ProductServer productServer;
    private final Scanner SCANNER = new Scanner(System.in);

    public ProductView() {
        productServer = new ProductServer();
    }

    public void ShowMenu() {
        boolean repeat = true;
        do {
            System.out.print(
                    "✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡ PRODUCT ✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡\n" +
                            "✡✡                        1. Show Product List                                     ✡✡\n" +
                            "✡✡                        2. Show a product By ID                               ✡✡\n" +
                            "✡✡                        3. Show a product By name                         ✡✡\n" +
                            "✡✡                        4. Add New Product                                      ✡✡\n" +
                            "✡✡                        5. Edit Infomation Product                           ✡✡\n" +
                            "✡✡                        6. Delete a Product By ID                              ✡✡\n" +
                            "✡✡                        7. Sort Product by ID ASC                             ✡✡\n" +
                            "✡✡                        8. Sort Product by ID ESC                             ✡✡\n" +
                            "✡✡                        9. Log out                                                       ✡✡\n" +
                            "✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡✡\n" +
                            "Enter you chose: " +
                            " ⭆ ");
            int chose = Integer.parseInt(SCANNER.nextLine());
            switch (chose) {
                case 1:
                    System.out.printf("\n\t%-16s%-56s%25s%30s%30s%20s\n\n","ID", "Name","Author","Category","QUaility","Price");
                    showProduct();
                    break;
                case 2:
                    showProductByID();
                    break;
                case 3:
                    showProductByName();
                    break;
                case 4:
                    addNewProduct();
                    break;
                case 5:
                    updateInfomation();
                    break;
                case 6:
                    deleteProductByID();
                    break;
                case 7:
                    productServer.SortByIDASC();
                    break;
                case 8:
                    productServer.SortByIDESC();
                    break;
                case 9:
                    repeat =false;
                default:
                    System.out.println("Wrong, please chose again: ");
            }
        } while (repeat);
    }

    public void showProduct() {
        for (Product product : productServer.findAll()) {
            System.out.print(product.toString());
        }
    }
    public void showProductByID(){
        System.out.print("Nhập ID cần tìm: ");
        long number = Integer.parseInt(SCANNER.nextLine());
        System.out.println(productServer.findAProductByID(number));
    }
    public void showProductByName(){
        System.out.print("Nhập tên cần tìm: ");
        String name = SCANNER.nextLine();
        System.out.println(productServer.findAProductByName(name));
    }
    public void addNewProduct(){
        long id = System.currentTimeMillis()/1000;
        System.out.print("Name : ");
        String name = SCANNER.nextLine();
        System.out.print("Author name : ");
        String author = SCANNER.nextLine();
        System.out.print("Category : ");
        String category = SCANNER.nextLine();
        System.out.print("Quaility : ");
        int quaility = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Price : ");
        double price = Integer.parseInt(SCANNER.nextLine());
        productServer.findAll().add(new Product(id,name,author,category,price,quaility));
        System.out.println("add product is succesful");
    }
    public void updateInfomation(){
        System.out.print("Enter ID: ");
        long ID = Long.parseLong(SCANNER.nextLine());
        for (Product product : productServer.findAll()){
            if (ID == product.getProductID()){
                boolean checked = true;
                String answer;
                do {
                    System.out.println("You want change ID(Yes/No)?");
                    answer = SCANNER.nextLine();
                    if (answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("No")){
                        checked =false;
                    }else {
                        System.out.println("please chose Yes or No");
                    }
                }while (checked);
                if (answer.equalsIgnoreCase("No")){
                    System.out.print("Name : ");
                    String name = SCANNER.nextLine();
                    System.out.print("Author name : ");
                    String author = SCANNER.nextLine();
                    System.out.print("Category : ");
                    String category = SCANNER.nextLine();
                    System.out.print("Quaility : ");
                    int quaility = Integer.parseInt(SCANNER.nextLine());
                    System.out.print("Price : ");
                    double price = Integer.parseInt(SCANNER.nextLine());
                    productServer.updateProductByID(new Product(ID,name,author,category,price,quaility));
                    System.out.println("Update is successful");
                    for (Product product1 : productServer.findAll()){
                        System.out.println(product1.toString());
                    }
                    return;
                }else {
                    long id = System.currentTimeMillis()/1000;
                    System.out.print("Name : ");
                    String name = SCANNER.nextLine();
                    System.out.print("Author name : ");
                    String author = SCANNER.nextLine();
                    System.out.print("Category : ");
                    String category = SCANNER.nextLine();
                    System.out.print("Quaility : ");
                    int quaility = Integer.parseInt(SCANNER.nextLine());
                    System.out.print("Price : ");
                    double price = Integer.parseInt(SCANNER.nextLine());
                    productServer.updateProductByID(new Product(ID,name,author,category,price,quaility));
                    System.out.println("Update is successful");
                    product.setProductID(id);
                    for (Product product1 : productServer.findAll()){
                        System.out.println(product1.toString());
                    }
                    return;
                }
            }
        }
        System.out.println("Can't find this ID, please check again.");
    }
    public void deleteProductByID(){
        System.out.println("Enter ID you wanna delete: ");
        long ID = Long.parseLong(SCANNER.nextLine());
        productServer.deleteProductByID(ID);
    }
}
