package tvt.libaryManagement.service;

import ProductManagement.Book;
import tvt.libaryManagement.model.Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductServer  {
    ArrayList<Product> productsList = new ArrayList<>();

    public ProductServer() {
        productsList.add(new Product(52, "harry potter and the philosopher's stone", "J. K. Rowling", "novel,Children's literature,", 120000, 5));
        productsList.add(new Product(53, "harry potter and chamber of secrets", "J. K. Rowling", "novel,Children's literature,", 220000, 7));
        productsList.add(new Product(56, "harry potter and Prisoner of Azkaban ", "J. K. Rowling", "novel,Children's literature,", 250000, 6));
        productsList.add(new Product(59, "harry potter and Goblet of Fire ", "J. K. Rowling", "novel,Children's literature,", 280000, 8));
        productsList.add(new Product(63, "harry potter and Order of the Phoenix", "J. K. Rowling", "novel,Children's literature,", 340000, 8));
        productsList.add(new Product(77, "harry potter and Half-Blood Prince", "J. K. Rowling", "novel,Children's literature,", 420000, 7));
        productsList.add(new Product(86, "harry potter and Deathly Hallows 1", "J. K. Rowling", "novel,Children's literature,", 520000, 5));
        productsList.add(new Product(96, "harry potter and Deathly Hallows 2", "J. K. Rowling", "novel,Children's literature,", 620000, 5));
        productsList.add(new Product(102, "Lord of the rings", "J. R. R. Tolkien", "Adventure story,High fantasy", 350000, 6));
        productsList.add(new Product(177, "The Godfather", "Morio Puzo", "novel", 300000, 5));
        productsList.add(new Product(188, "Les Miserables", "Victor Hugo", "novel", 420000, 6));
    }

    public List<Product> findAll() {
        return productsList;
    }

    public void showProduct() {
        for (Product product : findAll()) {
            System.out.println(product.toString());
        }
    }

    //thêm vào list
    public void addNewProduct(Product newProduct) {
        newProduct.setProductID(System.currentTimeMillis() / 1000);
        findAll().add(newProduct);
        for (Product product : findAll()) {
            System.out.print(product.toString());
        }
    }

    //chỉnh sửa thông tin
    public void updateProductByID(Product newProduct) {
        for (Product product : findAll()) {
            if (product.getProductID() == newProduct.getProductID()) {
                long productID = newProduct.getProductID();
                String productName = newProduct.getProductName();
                if (productName != null) {
                    product.setProductName(productName);
                }
                String productAuthor = newProduct.getAuthor();
                if (productAuthor != null) {
                    product.setAuthor(productAuthor);
                }
                String productCategory = newProduct.getCategory();
                if (productCategory != null) {
                    product.setCategory(productCategory);
                }
                int productQuaility = newProduct.getProductQuaility();
                if (productQuaility != 0) {
                    product.setProductQuaility(productQuaility);
                }
                double productPrice = newProduct.getProductPrice();
                if (productPrice != 0) {
                    product.setProductPrice(productPrice);
                }
                break;
            }
        }
    }

    //tìm theo ID
    public Product findAProductByID(long productID) {
        for (Product product : findAll()) {
            if (product.getProductID() == productID) {
                return product;
            }
        }
        System.out.println("ID is wrong, please check again.");
        return null;
    }

    //tìm theo tên
    public Product findAProductByName(String productName) {
        for (Product product : findAll()) {
            if (product.getProductName().equals(productName)) {
                return product;
            }
        }
        System.out.println("Can't find Product by this name, please check again.");
        return null;
    }

    //xóa theo ID
    public void deleteProductByID(long ID) {
        for (Product product : findAll()) {
            if (product.getProductID() == ID) {
                findAll().remove(product);
                for (Product product1 : findAll()) {
                    System.out.println(product1.toString());
                }
                return;
            }
        }
        System.out.println("Can't find this ID, please check again.");
    }

    //Sort theo ID
    public void SortByIDASC() {
        ArrayList<Product> newList = new ArrayList<>(findAll());
        Collections.sort(newList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getProductQuaility() - o2.getProductQuaility();
            }
        });
        for (Product product : newList) {
            System.out.print(product.toString());
        }
    }

    public void SortByIDESC() {
        ArrayList<Product> newList = new ArrayList<>(findAll());
        Collections.sort(newList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getProductQuaility() - o1.getProductQuaility();
            }
        });
        for (Product product : newList) {
            System.out.print(product.toString());
        }
    }
}
