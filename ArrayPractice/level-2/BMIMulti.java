import java.util.Scanner;

public class BMIMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            double w = sc.nextDouble();
            if (w <= 0) {
                System.out.println("Enter a positive weight.");
                i--;
                continue;
            }
            System.out.println("Enter height (m) for person " + (i + 1) + ": ");
            double h = sc.nextDouble();
            if (h <= 0) {
                System.out.println("Enter a positive height.");
                i--;
                continue;
            }
            personData[i][0] = w;
            personData[i][1] = h;
        }

        for (int i = 0; i < number; i++) {
            double w = personData[i][0];
            double h = personData[i][1];
            double bmi = w / (h * h);
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("Weight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.println(personData[i][0] + "\t" + personData[i][1] + "\t" + personData[i][2] + "\t" + weightStatus[i]);
        }
    }
}
