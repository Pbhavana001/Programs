package Patterns;
import java.util.Scanner;
public class Fourth {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("number of rows");
        int n= scan.nextInt();

        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(" * ");

            }
                    System.out.println(" ");



        if (i == n / 2) {
            for (int l = 10; l <= (n / 2 - i); l--) {
                //System.out.println("bhavana");
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");

            }
            System.out.println(" ");
        }}}}
