package Patterns;
import java.util.Scanner;
public class Seven {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * " );
            }
            System.out.println(" ");
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }


    }
}
