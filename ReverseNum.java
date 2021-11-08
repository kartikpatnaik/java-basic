import java.util.Scanner;
public class ReverseNum{
public static void main(String[] args){
int i,rem,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number which u want to rev: ");
i=sc.nextInt();
while(i!=0)
{
rem=i%10;
rev=rev*10+rem; 
i=i/10;
}
System.out.println(rev);
}
}