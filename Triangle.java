import java.util.Scanner;
public class Triangle{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter base of the triangle: ");
double b= sc.nextInt();
System.out.println("Enter height of the triangle: ");
double h= sc.nextInt();
double area= (b*h)/2;
System.out.println("Area of circle is: "+area);
}
}