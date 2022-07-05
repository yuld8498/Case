package Test;

import tvt.libaryManagement.model.Product;
import tvt.libaryManagement.service.ProductServer;

import java.io.*;

public class FileWithObject {
    public static void main(String[] args) {
        ProductServer productServer = new ProductServer();
        for (Product product: productServer.findAll()){
            System.out.println(product);
        }
        //trỏ đến file và ghi dữ liệu vào. dùng FileOutputStream để trỏ tới file, dùng ObjectOuputStream để tạo đối tượng ghi file.
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Module2\\Case\\CaseStudy\\src\\Test\\ProductList.txt");
            ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
            for (Product product: productServer.findAll()){
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
            FileInputStream fileInputStream =new FileInputStream("D:\\Module2\\Case\\CaseStudy\\src\\Test\\ProductList.txt");
            ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
            System.out.println("Product List in file: ");
            while (fileInputStream.available()>0){
                System.out.println(objectInputStream.readObject());
            }
            objectInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}