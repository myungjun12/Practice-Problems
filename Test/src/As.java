
public class As {

	public static void main(String[] args) {
		String str = "JavaProgramming";
		
		System.out.println(str.length()); // 15
		
		char[] ch = new char[str.length()];
		
		for(int i = 0; i < ch.length; i++ ) {
			ch[i] = str.charAt(i);
			System.out.print(ch[i] + " ");
		}
		System.out.println();
	}
	
}
