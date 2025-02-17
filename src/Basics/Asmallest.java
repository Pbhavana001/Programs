package Basics;

import java.util.Arrays;
public class Asmallest {
    static void small(int arr[]){
        int small= arr[0];
        for(int i =1; i<arr.length ; i++){
            if(arr[i]<small){
                arr[i]=small;
            }
        }
        System.out.println("the smallest number is " + small);
     Arrays.sort(arr);
     for(int i=0;i<arr.length;i++){
         System.out.print(" "+arr[i]);
     }
    }
    public static void main(String args[]){
        int s[]={ 12757 ,2463462, 3435727, 23572357, 686384684};
        small(s);
    }
}

