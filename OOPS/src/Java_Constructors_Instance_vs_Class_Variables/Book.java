package Java_Constructors_Instance_vs_Class_Variables;

class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String toString() {
        return "Book [Title=" + title + ", Author=" + author + ", Price=" + price + "]";
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Java Programming";
        book.author = "Ayush";
        book.price = 4.99;
        System.out.println(book);
    }
}
