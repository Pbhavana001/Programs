package Oops_Concepts;
import java.util.Scanner;
import java.util.ArrayList;
class Employee{
    public void employee(ArrayList<String> names){
        String name=null;
        for(String name1:names){
        System.out.println(name1);
    }}
}
class Department extends Employee {
    public void add_dept(ArrayList<String> dept_names){
        String name;
        for(String dept:dept_names)
            System.out.println(dept);
    }
}
public class Employee_Management_System {
    public static void main(String[] args){
        ArrayList<String> names =new ArrayList<>();
        ArrayList<String> dept_names =new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the names/type 'exit' to exit : ");
        while(true) {
            String name= scan.nextLine();
            if(name.equals("exit")){
           break;
        }
            else {
                names.add(name);
            }
    }
        System.out.println("Enter the departments/ type 'exit' to exit : ");
        while(true) {
            String dept= scan.nextLine();
            if(dept.equals("exit")){
                break;
            }
            else {
                names.add(dept);
            }
        }
        scan.close();
        Employee naming=new Employee();{
        naming.employee(names);}
        Department dept=new Department();{
            dept.add_dept(dept_names);}}

}
