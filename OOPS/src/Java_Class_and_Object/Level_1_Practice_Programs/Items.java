package Java_Class_and_Object.Level_1_Practice_Programs;

class Items {
    String itemCode;
    String itemName;
    double price;

    Items(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    double totalCost(int qty) {
        return qty * price;
    }

    public String toString() {
        return "Item [Code=" + itemCode + ", Name=" + itemName + ", Price=" + price + "]";
    }

    public static void main(String[] args) {
        Items i1 = new Items("01AA", "Water Bottle", 500);
        Items i2 = new Items("01BB", "Rice", 700);
        System.out.println(i1 + " | Total(2) = " + i1.totalCost(2));
        System.out.println(i2 + " | Total(3) = " + i2.totalCost(3));
    }
}

