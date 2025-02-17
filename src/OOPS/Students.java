package OOPS;

import java.util.Scanner;
class Students {
    private int student;
    private int teacher;
    public Students(int initialStudents , int intialTeachers){
        this.student=initialStudents;
        this.teacher=intialTeachers;
    }
    public int getStudent(){
        return student;
    }
    public int getTeacher(){
        return teacher;
    }
    public int total(){
        return student +teacher;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the no of students in the school");
        int student=scan.nextInt();
            System.out.println("Please enter the no of teachers");
            int teacher=scan.nextInt();
            Students sum=new Students(student,teacher);
            System.out.println("Total ppl in the school :" + sum.total());
            scan.close();
        }
    }

//Student count =new Student(students); {
//System.out.println("total no of students are " +count.getStudent());