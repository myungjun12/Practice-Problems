
class Parents{
	int x,y;
	
	public Parents() {
	}

	public Parents(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
}

public class Child extends Parents{

//필드
	int z;
	//생성자
	public Child(int x,int y,int z) {//모든 생성자는 첫줄에 다른 생성자를 호출해야한다.
	super(x,y); // super() : 상속관계의 부모 클래스 생성자 호출
	this.z = z;// 상속받은 생성자는 호출해서 super()로 처리하고 본인의 필드에 인스턴스변수z만 수행
	}
	
	
}

