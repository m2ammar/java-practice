

import java.util.Scanner;

public class PrimeChecker {
    public static boolean isPrime(int num) {

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to check if its prime or not");
            int num = sc.nextInt();

            isPrime(num);
            System.out.println(isPrime(num));
        }

    


}
