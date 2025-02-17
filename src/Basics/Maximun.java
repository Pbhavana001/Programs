package Basics;

import java.util.Scanner;
class Maximun {
    static void max(int[] arr){
        int maxi=arr[0];
        for(int i=1 ; i<arr.length;i++){
            if(maxi<arr[i]){
                maxi=arr[i] ;
            }
        }
        System.out.println("The maximum number is "+ maxi);
    }
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter size");
        int size = scan.nextInt();//size array
        int[] num = new int[size];//array
        for(int i=0 ; i<size ;i++){
       num[i]=scan.nextInt();
        }
max(num);
    }
}

