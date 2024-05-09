package practice;


public class Test{
	private 	int prv; // 같은클레스
				int dft; // 같은 패키지
	protected	int prt; // 같은 패키지 + 자손 (다른패키지)
	public 		int pub; // 접근 제한 없음
	
	public void  TestMember() {
		System.out.println(prv);
		
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}
class Test1 {
	public static void main(String[] args) {
		Test t = new Test();
//		System.out.println(t.prv); //에러 : private 같은 클레스를 벗어나서 사용하려했기에 
		System.out.println(t.dft); //ok
		System.out.println(t.prt); //ok
		System.out.println(t.pub); //ok
		
	}
}
