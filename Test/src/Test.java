import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Integer [] arr = {2,4,6,7,10,12,};  
		List<Integer> ls = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println(ls.get(0)); // 2
		ls.set(0, 3); // 0번째 인덱스 3으로 바뀜
		System.out.println(ls.get(0)); // 0번째 인덱스 3
		int abc = ls.set(0, 5); 
		// 0번째 인덱스 제거하고 5로 바꿀건데. 바꾸기전에 리턴값으로 기존값 줄게 abc에
		System.out.println(abc); //기존 3
		System.out.println(ls.get(0)); // 지나서는 5
		 int r = ls.remove(0);//삭제할건데. 삭제하기전에 리턴값 줄게 r에
		 System.out.println(r); //5 
		 System.out.println(ls.get(0)); //4
		
//		set을 하면 인덱스값에 기존의 값이 제거되고 새로운 리터럴이 들어가는데
//		근데 set함수가 return 해주면
//		변경 되기전에 기존 값을 반환 해준다.
//		리턴값이 기존값을 들고있다.
	}
}
