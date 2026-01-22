class Employee{
    private int id;
    private String name;
    private long monthlysalary;
    static String companyname="Innovatechs";
    public void setid(int id){
        this.id=id;
    }
    public int getid(){
        return id;
    }   
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setmonthlysalary(long monthlysalary){
        this.monthlysalary=monthlysalary;
    }
    public static long calculateAnnualsalary(long monthlysalary){
        return monthlysalary*12;
}
public void displayEmployeedetails(){
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Monthly Salary: " + monthlysalary);
    System.out.println("Annual Salary: " + calculateAnnualsalary(monthlysalary));
}
}
public class javabasics2 {
public static void main(String args[]){
    Employee emp=new Employee();
    emp.setid(101);
    emp.setname("John Doe");
    emp.setmonthlysalary(5000);
    emp.displayEmployeedetails();  
 }
}
