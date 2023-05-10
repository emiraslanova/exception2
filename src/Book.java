public class Book {
    private String title;
    private  String author;
    private  String seriya;
    private double price;
    private int quantity;

    public Book(String title, String author, String seriya, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.seriya = seriya;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", seriyaNumber='" + seriya + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSeriyaNumber() {
        return seriya;
    }

    public void setSeriyaNumber(String seriyaNumber) {
        this.seriya = seriyaNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
