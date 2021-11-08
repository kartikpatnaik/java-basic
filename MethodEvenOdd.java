import java.util.Scanner;
public class MethodEvenOdd{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the int");
int i=sc.nextInt();
if(isEven(i))
{
System.out.println("Even");
}
else{
System.out.println("odd");
}
}
public static boolean isEven(int number)
{
if(number%2==0)
{
return true;
}
else{
return false;
}
}
}