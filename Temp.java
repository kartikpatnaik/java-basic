import java.util.Scanner;
public class Temp{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string: ");
String st=sc.next();
int len=st.length();
String str="";
for(int i=0;i<len;i++)
{
char ch=st.charAt(i);
str=ch+str;
}
if(st.equals(str))
System.out.print("palindrome");
else
System.out.print("Not Palindrome");
sc.close();
}
}