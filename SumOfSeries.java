/*Write a program to calculate the sum of following 
series where n is input by user. 
1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n */

import java.util.Scanner;
public class SumOfSeries{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int number;
double sum=0;
System.out.println("Enter number of terms of series: ");
number=sc.nextInt();
for (int i=1;i<=number;i++)
{
sum+=1.0/i;
}
System.out.println("Sum: "+sum);
}
}