
public class MethodOverloading {
	void show() {
		System.out.println("1");
	}
	void show(int a) {
		System.out.println("2");
	}

	public static void main(String[] args) {
		MethodOverloading t=new MethodOverloading();
		t.show();
		

	}

}
