// Write a Java program that takes three numbers as input to 
//calculate and print the average of the numbers. 
import java.util.Scanner;
public class Avgg{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter first no: ");
int a=sc.nextInt();
System.out.println("enter 2nd no: ");
int b=sc.nextInt();
System.out.println("enter 3rd no:");
int c=sc.nextInt();
int avg=(a+b+c)/3;
System.out.println("Avg is: "+avg);
}
}