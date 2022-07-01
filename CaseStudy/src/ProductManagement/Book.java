package ProductManagement;

public class Book {
    private int ID;
    private String name;
    private String category;
    private int price;
    private int amount;
    private String author;


    public Book(int ID, String name, String category, String author, int price, int amount) {
        this.ID = ID;
        this.name = name;
        this.category = category;
        this.price = price;
        this.amount = amount;
        this.author = author;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return
                "ID = " + ID +
                ", Name= "+ name +
                        ", Category= " + category +
                        ", Author= '" + author +
                        ", Price= " + price +
                        ", Amount= " + amount
                ;
    }
}
