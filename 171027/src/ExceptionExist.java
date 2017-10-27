
public class ExceptionExist {
	public static void main(String[] arg) {
		func();
	}
	static void func() {
		int i=0;
		int j=1;
		System.out.println(i/j); //1을 0으로 나누면 예외발생
	}

}
