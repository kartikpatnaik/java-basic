public class TwoDimensionWeek{
public static void main(String[] args){
String[] days1={
"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Satuarday"};

String [][] days2=new String[][]{
{"1", "Monday"},
{"2", "Tuesday"},
{"3", "Wednesday"},
{"4", "Thursday"},
{"5", "Friday"}, 
{"6", "Satuarday"}
};

for(int i=0;i<days1.length;i++){
System.out.println(days1[i]);
}
System.out.println("--------------------------------");
for(int i=0;i<days2.length;i++)
for(int j=0;j<days2[i].length;j++)
System.out.println(days2[i][j]);
}

}
