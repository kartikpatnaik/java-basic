import java.util.Scanner;
public class PalindromeString{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string: ");
String s=sc.next();
int len=s.length();
String st="";
for(int i=0;i<len;i++)
{
char ch=s.charAt(i);
st=ch+st;
}
if(s.equals(st))
System.out.println("Palindrome");
else
System.out.println("not palindrome");
sc.close();
}
}