package Java_Constructors_Instance_vs_Class_Variables;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000.0;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public String toString() {
        return "CarRental [Customer=" + customerName + ", CarModel=" + carModel + ", RentalDays=" + rentalDays + ", TotalCost=" + calculateTotalCost() + "]";
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Ayush","Mercedes",45);
        System.out.println(cr);
    }
}
