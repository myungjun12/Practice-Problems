import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class T2 {
	public void collect(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		String[] strArr = {"a","d","w","s","q"};
		List<String> list = Arrays.asList("너를","나는","사랑해","나는");
		List<Integer> list2 = Arrays.asList(5,4,2,6);
		List<Integer> sortedList = list2.stream().sorted().collect(Collectors.toList());
		System.out.println(list2);
		System.out.println(sortedList);
		// 문자배열과 숫자배열 str[] int[] = Stream 변환
		//Stream<기대하는타입> stream = Stream.of(배열주소가진 변수명);
		Stream<String> stream = list.stream();
//		 중간연산 distinct/sorted   최종연산 forEach(System.out::println);
		stream.distinct().sorted().forEach(System.out::println);
//		stream.sorted().distinct().forEach(System.out::println);
		Stream<Integer> stream2 = list2.stream();
		stream.forEach(new T2()::collect);
	}
}
