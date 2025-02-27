package Oops_Concepts;
import java.util.Scanner;
import java.util.ArrayList;

class customer1{
public String Names(String name){
    return name;
}
}
class Products{
    public void ProductNames(){
    ArrayList<String> prod = new ArrayList<>();
    {
        prod.add("1. banana = 10$");
        prod.add("2 . Grapes = 12$");
        prod.add("3 . Apple = 15$");
    }
        System.out.println(prod);

    }
}
class Orders extends Products{
    public void OrdersChoosed(int item) {
        }
}

public class E_Commerce_System {
    public static void main(String[] args) {
        System.out.println("Welcome to FRESH");
        System.out.print("Please enter ur Name :");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello  " + name);
        System.out.println("PRODUCTS : ");

        Products names = new Products();
        names.ProductNames();

        Orders items = new Orders();
        System.out.print("Select ur items :");
        while (true) {
            int item = scan.nextInt();
            switch (item) {
                case 1:
                    System.out.println("Item 1 is added to the cart");
                    items.OrdersChoosed(item);
                    break;
                case 2:
                    System.out.println("Item 2 is added to the cart");
                    items.OrdersChoosed(item);
                    break;
                case 3:
                    System.out.println("Item 3 is added to the cart");
                    items.OrdersChoosed(item);
                    break;
                default:
                    System.out.println("Please enter valid item");
            }
        }

    }}
