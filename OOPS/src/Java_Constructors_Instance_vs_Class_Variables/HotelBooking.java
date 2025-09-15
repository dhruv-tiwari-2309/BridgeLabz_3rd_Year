package Java_Constructors_Instance_vs_Class_Variables;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    public String toString() {
        return "HotelBooking [Guest=" + guestName + ", RoomType=" + roomType + ", Nights=" + nights + "]";
    }

    public static void main(String[] args) {
        HotelBooking hb = new HotelBooking();
        hb.guestName = "Bob";
        hb.roomType = "Standard";
        hb.nights = 1;
        System.out.println(hb);
    }
}
