package Java_Constructors_Instance_vs_Class_Variables;

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
        }
    }

    public String toString() {
        return "LibraryBook [Title=" + title + ", Author=" + author + ", Price=" + price + ", Available=" + available + "]";
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Shakesper", "Ayush",45.99,true);
        System.out.println(lb);
    }
}

