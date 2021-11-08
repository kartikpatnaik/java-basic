public class MethodDemo
{
public static void main(String[] args)
{
System.out.println("Advantage of methods.");
displayLine();
System.out.println("Write once use many times");
displayLine();
}
public static void displayLine()
{
for(int i=1;i<=40;i++)
{
System.out.print("_");
}
System.out.println(" ");
}
}