package Patterns;
import java.util.Scanner;
public class Right_Angled_Triangle_Numbers{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the number of rows :");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println( " ");
        }
    }
}
