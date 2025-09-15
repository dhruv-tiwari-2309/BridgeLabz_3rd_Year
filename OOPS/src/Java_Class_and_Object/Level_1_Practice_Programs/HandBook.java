package Java_Class_and_Object.Level_1_Practice_Programs;

class HandBook {
    String title;
    String author;
    double price;

    HandBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "Book [Title=" + title + ", Author=" + author + ", Price=" + price + "]";
    }

    public static void main(String[] args) {
        HandBook b1 = new HandBook("2 States", "Chetan Bhagat", 500);
        HandBook b2 = new HandBook("Wings of Fire", "APJ Abdul Kalam", 600);
        System.out.println(b1);
        System.out.println(b2);
    }
}
