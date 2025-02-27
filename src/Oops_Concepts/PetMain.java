package Oops_Concepts;

public class PetMain{
    public static void main(String[] args){
        Dog myDog=new Dog("Ramu" , 2 , "Golden Retriver");
        Bird myBird=new Bird("Seetha", 2 , "canary",25.5);
        System.out.println("DOG DETAILS");
                myDog.details();
                myDog.makeSound();
        System.out.println("------------------------");
        System.out.println(" ");
        System.out.println("BIRD DETAILS");
        myBird.details();
        myBird.makeSound();
        
    }
}
