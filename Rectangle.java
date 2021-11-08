import java.util.Scanner;
public class Rectangle{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the lenght of rectangle: ");
int a= sc.nextInt();
System.out.println("Enter the width of the rectangle: ");
int b= sc.nextInt();
int area=a*b;
System.out.println("Area is: " + area);
}
}