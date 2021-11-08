import java.util.Scanner;
public class Method{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num1,num2;

System.out.println("Enter the first num");
num1=sc.nextInt();
System.out.println("Enter the second num");
num2=sc.nextInt();

int sum=getTotal(num1,num2);
System.out.println("Sum "+sum);
}
public static int getTotal(int number1, int number2)
{
return number1+number2;
}
}