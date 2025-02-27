package Oops_Concepts;
public class pet {
    private String Name;
    private int Age;
    private String Breed;
    public pet(String name , int age , String breed){
        this.Name=name;
        this.Age=age;
        this.Breed=breed;
    }

    public int getAge() {
        return Age;
    }

    public String getBreed() {
        return Breed;
    }

    public String getName() {
        return Name;
    }
    public void details(){
        System.out.println("Pet Name : " + Name);
        System.out.println("Age : " + Age);
        System.out.println("Breed : " + Breed);
    }
    public void makeSound(){
        System.out.println("This pet make sound !");
    }

}
class Dog extends pet {
    private String favoriteToy;
    public Dog(String name , int age , String breed){
        super(name, age, breed);
    }
    public String getFavoriteToy() {
        return favoriteToy;
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof Woof");
    }
    public void details(){
        super.details();
        System.out.println("Favorite Toy" + favoriteToy);
    }
}
class Bird extends pet{
    private double wingSpan;

    public Bird(String name, int age, String breed, double wingSpan) {
    super(name,age,breed);
    this.wingSpan=wingSpan;
}

    public double getWingSpan() {
        return wingSpan;
    }
    public void makeSound(){
        System.out.println(getName() + "says : Chrip Chrip!");
    }
}
