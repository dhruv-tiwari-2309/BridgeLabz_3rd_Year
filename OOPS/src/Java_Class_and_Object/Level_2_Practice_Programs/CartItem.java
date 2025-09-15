package Java_Class_and_Object.Level_2_Practice_Programs;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (qty <= quantity) quantity -= qty;
    }

    double totalCost() {
        return price * quantity;
    }

    public String toString() {
        return "CartItem [Item=" + itemName + ", Price=" + price + ", Quantity=" + quantity + ", Total=" + totalCost() + "]";
    }

    public static void main(String[] args) {
        CartItem c = new CartItem("Laptop", 999.99, 1);
        System.out.println(c);
        c.addItem(2);
        System.out.println(c);
        c.removeItem(1);
        System.out.println(c);
    }
}