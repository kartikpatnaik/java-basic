import java.util.*;
public class Swap{
public static void main(String[] args){
int x,y,z;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of x and y");
x=sc.nextInt();
y=sc.nextInt();
System.out.println("befoe swapping: "+x+" "+y);
z=x;
x=y;
y=z;
System.out.println("After Swapping: "+x+" "+y);
System.out.println();
}
}