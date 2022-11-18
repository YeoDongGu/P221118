package book.ex5;

public class Main {

	public static void main(String[] args) {
		Parent pa = new Parent();
		Child ch = new Child();

		if (pa instanceof Parent) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (pa instanceof Child) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (ch instanceof Parent) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (ch instanceof Child) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
