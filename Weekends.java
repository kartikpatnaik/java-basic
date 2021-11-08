import java.util.Scanner;
public class Weekends{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int i=sc.nextInt();
switch(i){
case 1: System.out.print("Sunday");
break;
case 2: System.out.print("Monday");
break;
case 3: System.out.print("Tuesday");
break;
case 4: System.out.print("Wednasday");
break;
case 5: System.out.print("Thursday");
break;
case 6: System.out.print("Friday");
break;
case 7: System.out.print("Satuarday");
break;
default: System.out.print("Invalid");
}
}
}