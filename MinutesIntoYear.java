import java.util.Scanner;
public class MinutesIntoYear{
public static void main(String[] args){
double minutesInYear=60*24*365;
Scanner input=new Scanner(System.in);
System.out.println("Enter the minutes: ");
double i=input.nextDouble();
long years=(long) (i/minutesInYear);
int days=(int) (i/60/24)%365;
System.out.println((int) i+" minutes is "+years+" years and "+days+" days ");
}
}