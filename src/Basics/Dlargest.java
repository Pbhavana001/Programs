package Basics;

import java.util.Arrays;
class Dlargest {
    static void Dlar(int arr[]){
        int min = arr[0];
        System.out.println("length of array is " + arr.length);
                for(int i=1 ; i<arr.length ; i++){
                    if(arr[i]>min){
                        min = arr[i];
                    }}
        System.out.println("largest element " + min);
        Arrays.sort(arr);
        for(int u=arr.length-1 ; u >=0 ;u--) {
            System.out.print( arr[u] + ",");
        }}
    public static void main(String[] args)
    {
        int b[] = {1 , 4 ,8, 5 , 2 , 0 , 9};
        Dlar(b);
    }}
