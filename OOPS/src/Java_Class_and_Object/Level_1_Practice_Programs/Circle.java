package Java_Class_and_Object.Level_1_Practice_Programs;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle [Radius=" + radius + ", Area=" + area() + ", Circumference=" + circumference() + "]";
    }

    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        System.out.println(c);
    }
}
