import java.util.stream.Stream;

class Test {
	public static void main(String[] args) {
		
		Stream<Integer> st = Stream.ofNullable(null);
		st.forEach(i -> System.out.println(i));
	}
}