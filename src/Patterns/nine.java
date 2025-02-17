package Patterns;

import java.util.Scanner;
public class nine {
    public static void main(String[] args) {
        static void mine()
        {
            int n = 5; // Size of the pattern

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // Condition to print '*' on diagonals
                    if (i == j || i + j == n - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  "); // Space for proper alignment
                    }
                }
                System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.print("rows :");
        int n = scan.nextInt();
        for (int i = 1;  i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int k = n; k >= 1; k--) {
                System.out.print(" ");

                for (int j = 1; j <= k; j++) {
                    System.out.print(" * ");
                }
                System.out.println(" ");

            }
        }
    }

}}}