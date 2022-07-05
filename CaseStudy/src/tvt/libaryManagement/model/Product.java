package tvt.libaryManagement.model;

import java.io.Serializable;

public class Product implements Serializable {
    private long productID;
    private String productName;
    private String author;
    private String category;
    private int productQuaility;
    private double productPrice;

    public Product() {

    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuaility() {
        return productQuaility;
    }

    public void setProductQuaility(int productQuaility) {
        this.productQuaility = productQuaility;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Product(long ID, String productName, String author, String category, double productPrice, int productQuaility) {
        this.productID = ID;
        this.author = author;
        this.category = category;
        this.productName = productName;
        this.productQuaility = productQuaility;
        this.productPrice = productPrice;
    }

    public Product(String productName, String author, String category, int productQuaility, double productPrice) {
        this.author = author;
        this.category = category;
        this.productName = productName;
        this.productQuaility = productQuaility;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return String.format(
                "\n\t%-25s%-36s%20s%36s%10s%20s\n\n",

                productID,
                productName,
                author,
                category,
                productQuaility,
                productPrice
        );
    }
}
