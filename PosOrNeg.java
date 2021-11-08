import java.util.Scanner;
public class PosOrNeg{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int i=sc.nextInt();
if(i<0){
System.out.println("It is negetive");
}
else{
System.out.println("It is Positive");
}
}
}