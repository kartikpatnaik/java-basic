import java.util.Scanner;
public class Square{
public static void main(String[] args){
System.out.println("Enter height of sqare: ");
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int area=i*i;
System.out.println("Area of square is: " + area);
}
}