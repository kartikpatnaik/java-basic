public class TwoDimensional{
public static void main(String[] args){
double[][] arr= new double[4][];
arr[0] =new double[4];
arr[1] = new double[3];
arr[2] = new double[2];
arr[3] = new double[1];

	for(int i=0; i<arr.length; i++){
	for(int j=0; j<arr[i].length;j++){
System.out.println("arr[" + i + "][" + j + "] : " + arr[i][j]);
System.out.println(arr[i][j] + " ");
}
}
}
}