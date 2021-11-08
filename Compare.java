import java.util.Scanner;
public class Compare{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter first int: ");
int x=sc.nextInt();
System.out.println("Enter 2nd int: ");
int y=sc.nextInt();

if(x<y)
System.out.println(x+"<"+y);
if(x>y)
System.out.println(x+">"+y);
if(x==y)
System.out.println(x+"="+y);

/*if(x==y)
System.out.printf("%d==%d\n", x,y);
if(x!=y)
System.out.printf("%d!=%d\n", x,y);
if(x<y)
System.out.printf("%d<%d\n", x,y);
if(x>y)
System.out.printf("%d>%d\n", x,y);*/
}
}