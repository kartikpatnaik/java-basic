public class Swapping{
public static void main(String[] args){
int a=10, b=20;
System.out.println("Before swapping "+a+" "+b);
int t=a;
a=b;
b=t;
/* logic2
a=a+b;
b=a-b;
a=a-b;*/

/* logic 3
a=a*b;
b=a/b;
a=a/b;  */
System.out.println("After swapping "+a+" "+b);
}
}