package book.ex5;

public class ChildExample {

	public static void main(String[] args) {
		Child ch = new Child();
		Parent pa = new Parent();

		pa.method1();
		pa.method2();

		ch.method1();
		ch.method2();
		ch.method3();
		System.out.println("--------------------------------");

		pa = ch;
		pa.method1();
		pa.method2();
	}

}
