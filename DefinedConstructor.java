
public class DefinedConstructor {
	int i=11;
	String s=aa;
	void display() {
		System.out.println(i+" "+s);
	}
	public static void main(String[] args) {
		DefinedConstructor a=new DefinedConstructor(11,"aa");
		DefinedConstructor b=new DefinedConstructor(22,"bb");
		a.display();
		b.display();
	}

}
