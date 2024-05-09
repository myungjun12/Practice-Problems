
public class Test {
	
	
	public Test() {
		
	}
	
	
	
	public static void information() {
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++ ) {
			lotto[i] = (int)(Math.random()* 31 +15);
			System.out.print(lotto[i] + " ");
		}
	}
	public static void main(String[] args) {
		System.out.println("로또 번호");
		information();
	}
}
