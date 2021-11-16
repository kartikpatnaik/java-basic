/*The Lambda expression is used to provide the 
implementation of an interface that has a 
functional interface
It saves a lot of code. In the case of the lambda
 expression, we don't need to define the method again 
for providing the implementation.
 An interface that has only one abstract method is 
called a functional interface. */


public interface LamExp 
	{
	
	public boolean compare(int a, int b);
	
		public static void main(String[] args)
	{
		LamExp z=(a, b)-> {return a>b;};
		boolean ans=z.compare(2, 1);
		System.out.println(ans);
	}
	}


