package Test;

import tvt.libaryManagement.model.Product;
import tvt.libaryManagement.service.ProductServer;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWithObject {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        ProductServer productServer = new ProductServer();
        for (Product product : productServer.findAll()) {
            System.out.println(product);
        }
        //trỏ đến file và ghi dữ liệu vào. dùng FileOutputStream để trỏ tới file, dùng ObjectOuputStream để tạo đối tượng ghi file.
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Module2\\Case\\CaseStudy\\src\\Test\\ProductList.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Product product : productServer.findAll()) {
                objectOutputStream.writeObject(product);
            }
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //In ra các đối tượng trong file với InputStream.
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Module2\\Case\\CaseStudy\\src\\Test\\ProductList.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println("Product List in file: ");
            while (fileInputStream.available() > 0) {
                System.out.println(objectInputStream.readObject());
            }
            objectInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        ArrayList<Product> arrayList = new ArrayList<>(productServer.findAll());
        writeProduct(arrayList);
        readProduct();
    }

    //Đọc file thành list
    public static void readProduct() {
        ArrayList<Product> newArraylist = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Module2\\Case\\CaseStudy\\src\\Test\\haha.txt");
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNext()) {
                Product product = new Product();
                product.setProductID(Integer.parseInt(scanner.nextLine()));
                product.setProductName(scanner.nextLine());
                product.setAuthor(scanner.nextLine());
                product.setCategory(scanner.nextLine());
                product.setProductQuaility(Integer.parseInt(scanner.nextLine()));
                product.setProductPrice(Double.parseDouble(scanner.nextLine()));
                newArraylist.add(product);
            }
            System.out.println("Next time: ");
            for (Product product : newArraylist) {
                System.out.println(product.toString());

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    //ghi list vào file
    public static void writeProduct(ArrayList<Product> arrayList) {
        try (PrintWriter printWriter = new PrintWriter("D:\\Module2\\Case\\CaseStudy\\src\\Test\\haha.txt")) {
            for (Product product : arrayList) {
                printWriter.println(product.getProductID());
                printWriter.println(product.getProductName());
                printWriter.println(product.getAuthor());
                printWriter.println(product.getCategory());
                printWriter.println(product.getProductQuaility());
                printWriter.println(product.getProductPrice());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}