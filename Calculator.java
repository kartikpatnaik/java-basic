/*
import java.util.Scanner;
public class Calc{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number: ");
int A= sc.nextInt();
System.out.println("Enter 2nd number: ");
int B= sc.nextInt();
int Add=A+B;
System.out.println("Result: " +Add);

int Sub=A-B;
System.out.println("Sub: " +Sub);

int Mul=A*B;
System.out.println(" Mul: "+Mul);

int Div=A/B;
System.out.println("Div: " +Div);
}
}
*/

import java.util.Scanner;
public class Calc{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your first number: ");
int a=sc.nextInt();
System.out.println("Enter second Number: ");
int b=sc.nextInt();
int sum=a+b;
int sub=a-b;
int mul=a*b;
int div=a/b;
System.out.printf("Sum =%d\n sub=%d\n mul=%d\n div=%d", sum, sub, mul, div);
}
}
