import java.util.Scanner;
public class Factor{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num;
int fact=1;
System.out.println("Enter the int: ");
num=sc.nextInt();
for(int i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("Fact: "+fact);
}
}