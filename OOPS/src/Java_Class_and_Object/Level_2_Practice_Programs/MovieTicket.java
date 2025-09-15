package Java_Class_and_Object.Level_2_Practice_Programs;

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    boolean booked;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "None";
        this.price = 0;
        this.booked = false;
    }

    void bookTicket(String seatNumber, double price) {
        if (!booked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.booked = true;
        } else {
            System.out.println("Ticket already booked!");
        }
    }

    public String toString() {
        if (booked) {
            return "MovieTicket [Movie=" + movieName + ", Seat=" + seatNumber + ", Price=" + price + "]";
        } else {
            return "MovieTicket [Movie=" + movieName + " not booked yet]";
        }
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("Dragon");
        System.out.println(t1);
        t1.bookTicket("A10", 120);
        System.out.println(t1);
        t1.bookTicket("B10", 120);
    }
}
