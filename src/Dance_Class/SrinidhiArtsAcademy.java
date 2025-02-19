package Dance_Class;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
public class SrinidhiArtsAcademy {
    private static ArrayList<String> students=new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Welcome to Srinidhi Arts Academy");
            System.out.println(" ");
            System.out.println("1. Select 1 to add students : ");
            System.out.println("2. Select 2 to remove students : ");
            System.out.println("3. Select 3 to know total number of students : ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    addStudents(scan);
                    break;
                case 2:
                    removeStudents(scan);
                    break;
                case 3:
                    displayStudents(scan);
                    break;
                case 4:
                    System.out.println("Thankyou");
                    scan.close();
                    return;
            }}}

    private static void displayStudents(Scanner scan) {
        int count=students.size();
        System.out.println("Total no of students are: " + count);
        System.out.println("These are the total students :" + students);

    }

    private static void addStudents(Scanner scan){
        System.out.println("Enter student names/press exit to move out :");
        while(true){
            String name = scan.nextLine();
            if(name.equals("exit")){
                System.out.println("Thankyou");
                break;
            }
            else{
            students.add(name);

        } System.out.println(name + " is added");
            System.out.println("Enter student names/press exit to move out :");
        }}
    private static void removeStudents(Scanner scan) {
            System.out.println("Enter the name to remove the student :");
            String name=scan.nextLine();
             if(students.contains(name)){
                students.remove(name);
                System.out.println(name + "is removed and to check remaining names please select option 3 ");
            }
        else if(students.isEmpty()){
            System.out.println("No names are available");
        }
            else{
                System.out.println("we don't have any student with that name");
            }

    }

}
