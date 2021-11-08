/* import java.util.*;
public class Random{
public static void main(String[] args){
System.out.println("1st Ranodom Number: "+Math.random());
System.out.println("2nd Random Number: "+Math.random());
}
}
*/

public class Random{
public static void main(String[] args){
int min=200;
int max=300;
System.out.println("Random value "+min+"to"+max+":");
double a=Math.random()*(max-min+1)+min;
System.out.println(a);
System.out.println("Random value of type int between "+min+"to"+max+":");
int b=(int)(Math.random()*(max-min+1)+min);
System.out.println(b);

}
}