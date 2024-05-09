package practice1;

public class Tv {  // 다형성 조상타입 참조변수로 자손 타입 객체를 다루는 것

	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channel() {++channel;}
	void channelDown(){channel--;}
	
}


class smartTv extends Tv{
	String text;
	void caption() {}
	
	public static void main(String[] args) {
		Tv t = new smartTv(); // 상속관계일때 조상타입 참조변수 사용가능
		
	}
}