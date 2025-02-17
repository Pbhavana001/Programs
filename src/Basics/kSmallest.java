package Basics;

class kSmallest {
    static void small(int arr[]){
        int small=arr[0];
        for(int i=1 ; i<arr.length ;i++){
            if(small > arr[i]){
            small=arr[i];

        }}
        System.out.println("Smallest is " + small);
    }
    public static void main(String args[]){
        int a[] = {7 , 8 , 7 , 1 , 3 , 0};
        small(a);
    }
}
