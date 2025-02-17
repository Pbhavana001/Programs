package Basics;

import java.util.Scanner;
public class stringCount {
    public static void main(String[] args){
        Scanner string=new Scanner(System.in);
        System.out.println("Enter the string :");
        String w=string.nextLine();
        int count =0;
        for(int i=0;i<w.length();i++)
        {
             count++;
        }
        System.out.println("number of letter in the give word is "+ count);

    }
}
