public class BatTapGioi2 {
    private String title;
    private String author;
    private double price;

    public BatTapGioi2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price + "$");
    }

    public static void main(String[] args) {
        BatTapGioi2 myBook = new BatTapGioi2("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        myBook.printInfo();
    }
}
