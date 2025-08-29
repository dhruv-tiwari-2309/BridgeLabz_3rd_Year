import java.util.Scanner;
public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] newFactors = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        newFactors[j] = factors[j];
                    }
                    factors = newFactors;
                }
                factors[index++] = i;
            }
        }
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}

