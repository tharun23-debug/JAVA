package day05;

import java.util.Scanner;

public class strong_number_usingfunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        if (isStrong(n)) {
            System.out.println("The number is strong number");

        } else {
            System.out.println("The number is not strong number");
        }


    }

    public static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;
        while (n != 0) {
            int pop = n % 10;
            sum += fact(pop);
            n = n / 10;

        }
        return sum == temp;
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
