import java.util.Arrays;
public class Exercise{
public static void main(String[] args){
int[] my_array1={1789,2035,1899,2013,1458,2458,1254,1472};
String[] my_array2={"java","python","c","c#","c++"};
System.out.println("original numberic array: "+Arrays.toString(my_array1));
Arrays.sort(my_array1);
System.out.println("Sorted string array: "+Arrays.toString(my_array1));
System.out.println("original string: "+Arrays.toString(my_array2));
Arrays.sort(my_array2);
System.out.println("Sorted string: "+Arrays.toString(my_array2));
}
}