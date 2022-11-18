package book.ex6;

public class InstanceofExample {

	public static void method1(Parent pa) {
		if (pa instanceof Child) {
			Child ch = (Child) pa;
			System.out.println("method1 = Child로 변환 성공");
		} else {
			System.out.println("method1 = Child로 변환 실패");
		}
	}

	public static void method2(Parent pa) {
		Child ch = (Child) pa;
		System.out.println("method2 = Child로 변환 성공");
	}

	public static void main(String[] args) {
		Parent paA = new Child();

		method1(paA);
		method2(paA);

		Parent paB = new Parent();
		method1(paB);
		method2(paB);
	}

}
