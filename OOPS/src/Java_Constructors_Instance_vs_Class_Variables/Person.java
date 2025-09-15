package Java_Constructors_Instance_vs_Class_Variables;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public String toString() {
        return "Person [Name=" + name + ", Age=" + age + "]";
    }

    public static void main(String[] args) {
        Person p1 = new Person("Bob", 18);
        System.out.println(p1);
    }
}
