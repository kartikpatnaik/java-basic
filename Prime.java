import java.util.Scanner;
class Prime{
public static  void main(String[] args){
/*int a=9;*/
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
int temp=0;
for(int i=1;i<=a-1;i++)
{
if(a%i==0)
{
temp=temp+1;
}
}
if(temp==0)
{
System.out.println(a+"is prime no");
}
else
{
System.out.println(a+"is not prime");
}
}
}