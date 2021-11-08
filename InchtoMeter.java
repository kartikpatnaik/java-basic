import java.util.Scanner;
public class InchtoMeter{
public static void main(String[] args){
double result=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Inch");
double i=sc.nextInt();
result=(i*0.0254);
System.out.println("after converting to meter: "+result);
}
}