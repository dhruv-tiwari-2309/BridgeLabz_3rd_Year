package Java_Class_and_Object.Level_2_Practice_Programs;

class Student {
    String name;
    String rollNumber;
    double[] marks;

    Student(String name, String rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    double calculateAverage() {
        double sum = 0;
        for (double m : marks) sum += m;
        return sum / marks.length;
    }

    String calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 80) return "Grade A";
        else if (avg >= 60) return "Grade B";
        else if (avg >= 50) return "Grade C";
        else if (avg >= 40) return "Grade D";
        else return "Grade F";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student [Name=").append(name)
                .append(", RollNo=").append(rollNumber)
                .append(", Marks=");
        for (double m : marks) sb.append(m).append(" ");
        sb.append(", ").append(calculateGrade()).append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        double[] m1 = {80, 70, 75};
        double[] m2 = {60, 65, 50};
        Student s1 = new Student("Thamarai", "ECE001", m1);
        Student s2 = new Student("Kannan", "CSC002", m2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
