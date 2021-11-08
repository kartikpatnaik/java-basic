import java.util.Scanner;
public class IfElse{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter an Int: ");
int i=sc.nextInt();
if(i%2==0)
System.out.println("Even");
else
System.out.println("odd");
}
}