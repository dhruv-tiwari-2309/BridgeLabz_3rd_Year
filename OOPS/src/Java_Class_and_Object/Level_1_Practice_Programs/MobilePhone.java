package Java_Class_and_Object.Level_1_Practice_Programs;

class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return "MobilePhone [Brand=" + brand + ", Model=" + model + ", Price=" + price + "]";
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("VIVO", "VIVO V29", 15999);
        MobilePhone m2 = new MobilePhone("ONE PLUS", "Nord 4", 39999);
        MobilePhone m3 = new MobilePhone("APPLE", "iPhone 16 Pro", 79999);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
