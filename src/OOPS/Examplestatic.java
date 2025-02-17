package OOPS;

public class Examplestatic {
    int d;
     static String b="hello";
    public void show(){
        System.out.println("number :"+ d + "name" +b);
    }
    public static void main(String[] args){
        Examplestatic obj=new Examplestatic();
        obj.d=5;
        System.out.println("number :"+ obj.d + "name" +b);
        Examplestatic obj2=new Examplestatic();

        System.out.println("number :"+ obj2.d + "name" + b);
        obj.show();
    }

}
