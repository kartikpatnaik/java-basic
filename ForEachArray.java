public class ForEachArray{
public static void main(String[] args){
String[] arr={"A", "B", "C", "D"};
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
System.out.println("-------------------");
for(int i=arr.length-1;i>=0;i--){
System.out.println(arr[i]);
}
System.out.println("--------------------");
for(String str:arr){
System.out.println(str);
}
}
}