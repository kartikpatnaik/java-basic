import java.util.Scanner;
public class Switch{
public static void main(String[] args){
char grade;
System.out.println("Enter your grade");
Scanner x=new Scanner(System.in);
grade = x.next().charAt(0);
switch(grade){
case 'a':
System.out.println("Excellent");
break;
case 'b':
System.out.println("Good");
break;
case 'c':
System.out.println("bad");
break;
case 'd':
System.out.println("fail");
}
}
}