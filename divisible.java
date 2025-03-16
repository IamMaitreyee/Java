import java.util.Scanner;

public class divisible {

    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        // Loop to find the divisors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i; // Add divisors
            }
        }

        // Check if the number is a perfect number
        if (number == sum) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        sc.close();
    }
}
