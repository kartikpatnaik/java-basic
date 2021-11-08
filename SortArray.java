import java.util.Arrays;
public class SortArray{
public static void main(String[] args)
{
int[]array=new int[]{80,48,49,20,93,83,82,04,99};
Arrays.sort(array);
System.out.println("Elements of array sorted ascending: ");
for(int i=0;i<array.length;i++)
{
System.out.println(array[i]);
}
}
}