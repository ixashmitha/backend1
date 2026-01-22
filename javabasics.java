import java.util.*;
public class javabasics{
    public static void basicprograms(){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0 && num%2==0){
            System.out.println("Positive and even");
        }
        else if(num>0 && num%2!=0){
            System.out.println("Positive and odd");
        }
        else if(num<0 && num%2==0){
            System.out.println("Negative and even");
        }
        else if(num<0 && num%2!=0){
            System.out.println("Negative and odd");
        }
        else{
            System.out.println("Zero");
        }
        return;
    }
    public static void printnumbers(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        System.out.println("Finished printing numbers up to " + n);
        return;
    }
    public static void printevennumbers(int n){
        for(int i=2;i<=n;i+=2){
            System.out.println(i);
        }
        System.out.println("Finished printing even numbers up to " + n);

        return;
    }
    public static void printsum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;   
        }
        System.out.println("The sum is: " + sum);
        return;
    }
    public static int add(int a,int b){
        System.out.println("The sum is: " + (a+b));
        return a+b;
    }
    public static boolean iseven(int n){
        if(n%2==0){
            System.out.println("The number is even");
            return true;
        }
        else{
            System.out.println("The number is odd");
            return false;
        }
    }
    public static int findfactorial(int n){
        if(n>1){
            int fact=1;
            for(int i=2;i<=n;i++){
                fact*=i;
            }
            System.out.println("the factorial is: " + fact);
            return fact;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        basicprograms();
        printnumbers(5);
        printevennumbers(4);
        printsum(5);
        add(3,4);
        iseven(7);
        findfactorial(5);
    }
}