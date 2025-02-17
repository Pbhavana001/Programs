package OOPS;

import java.util.Scanner;
public class Encapsulation {
    private String name;
    private int age;
    public Encapsulation(String name , int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name)
    { this.name=name;
    }
    public void setAge(int age ){
        if(age>0){
            this.age=age;}
            else{
                System.out.println("Enter age is invalid");
        }}
        public void details(){
            System.out.println("NAME :" + name + " || " + "AGE " + age);
        }
        public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        System.out.print("Enter the name :");
        String userName=Scan.nextLine();
            System.out.print("Enter the age :") ;
        int  userAge=Scan.nextInt();
            Scan.nextLine();
            Encapsulation personalDetails = new Encapsulation(userName ,userAge);
            personalDetails.details();

            System.out.println("Enter the new name :");
            String updatedName=Scan.nextLine();
            personalDetails.setName(updatedName);

            System.out.println("Enter the new age :") ;
            int updatedAge=Scan.nextInt();
            personalDetails.setAge(updatedAge);
            personalDetails.details();


    }

}
