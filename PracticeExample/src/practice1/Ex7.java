package practice1;

public class Ex7 {

	public static void main(String[] args) {
		
		Car car = new Car();
		FireEngine fe = new FireEngine();
		FireEngine fe2 = (FireEngine)car;// 조상 > 자손 형변환
		fe2.stop();
//		Car car2 = (Car)fe2; // 자손 > 조상 형변환 생략가능
//		car2.drive(); // NullPointerException
		
		
		
		
		
		//		FireEngine fe2 = null;
//		
//		fe.water();
//		car = fe; //car = (car)fe; 형변환 생략됨
////		car.water();
//		fe2 = (FireEngine)car; //자손타입←조상타입.형변환 생략불가 
//		fe2.water();
	}
}

class Car{
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrrr~~~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}
