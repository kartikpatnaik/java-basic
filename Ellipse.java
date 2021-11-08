import java.util.Scanner;
public class Ellipse{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter value of a axis: ");
double a=sc.nextInt();
System.out.println("Enter the value of b axis: ");
double b=sc.nextInt();
double pi=3.14;
double area=pi*a*b;
System.out.println("Area of ellipse is: "+area);
}
}