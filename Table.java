import java.util.Scanner;
public class Table{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int table;
System.out.println("Enter an int: ");
table=sc.nextInt();
System.out.println("Table"+ table);
for(int j=1;j<=10;j++)
{
System.out.println(table + "*" + j +"=" + (table*j) );
}

}
}