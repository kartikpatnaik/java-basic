//Write a Java program to divide two numbers and print on the screen.

/* public class Divide{
public static void main(String[] args)
{
int A=20;
int B=10;
int result=A/B;
System.out.println("Result = "+result);
}
} */

import java.util.Scanner;
public class Divide{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 1st number: ");
int a = sc.nextInt();
System.out.println("Enter the 2nd number: ");
int b = sc.nextInt();
int result= a/b;
System.out.println("Result is: " +result);
}
}

