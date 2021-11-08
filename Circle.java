import java.util.Scanner;
public class Circle{
public static void main(String[] args){
System.out.println("Enter the radius of circl: ");
Scanner sc=new Scanner(System.in);
int r= sc.nextInt();
double pi=3.14;
double area=pi*r*r;
System.out.println("Area of circle is: " +area);
}
}
