package book.ex3;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			String[] loc = { "앞왼쪽", "앞오른쪽", "뒤왼쪽", "뒤오른쪽" };
			int[] life = { 15, 13, 14, 17 };
			if (problemLocation != 0) {
				car.tires[problemLocation - 1] = new HanKookTire(loc[problemLocation - 1], life[problemLocation - 1]);
			}
			System.out.println("------------------------------------------------");
		}

//			switch (problemLocation) {
//			case 1:
//				System.out.println("앞왼쪽 HanKookTire로 교체");
//				car.tires[0] = new HanKookTire("앞왼쪽", 15);
//				break;
//			case 2:
//				System.out.println("앞오른쪽 HanKookTire로 교체");
//				car.tires[1] = new HanKookTire("앞오른쪽", 13);
//				break;
//			case 3:
//				System.out.println("뒤왼쪽 HanKookTire로 교체");
//				car.tires[2] = new HanKookTire("뒤왼쪽", 14);
//				break;
//			case 4:
//				System.out.println("뒤오른쪽 HanKookTire로 교체");
//				car.tires[3] = new HanKookTire("뒤오른쪽", 17);
//				break;
//			}

	}

}
