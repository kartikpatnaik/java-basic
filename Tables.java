import java.util.Scanner;
public class Tables{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Input a number: ");
int x= sc.nextInt();
for (int i=0; i<10; i++){
System.out.println(x + " * " +(i+1) + "= "+(x*(i+1)));
}
}
}
