import java.util.Scanner;
class Student {
    private int id;
    private String name;
    private int marks;

    public void setmarks(int marks) {
        this.marks = marks;
    }

    public int getmarks() {
        return marks;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    public static void ispassed(float marks) {
        if (marks >= 40) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
    public void printdetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        ispassed(marks);
    }
}
    public class javabasics1{
   public static void main(String args[]){
   Student stu=new Student();
   stu.setid(67);
   stu.setname("hdidwj");
   stu.setmarks(33);
    stu.printdetails();
   }
}
