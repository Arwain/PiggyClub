
public class TestCommit {

	public String greeting() {
		return "Hello World";
	}

	public static void main(String[] args) {
		TestCommit t = new TestCommit();
		System.out.println(t.greeting());
	}
}
