import java.util.Scanner;
public class Trapezium{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter base of a: ");
double a=sc.nextInt();
System.out.println("Enter base of b: ");
double b=sc.nextInt();
System.out.println("Enter the height of trap: ");
double h=sc.nextInt();
double area=(a+b)/2*h;
System.out.println("Area of Trapezium is: "+ area);
}
}