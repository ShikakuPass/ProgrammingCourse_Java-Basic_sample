package p01;

/*
 * 引数がなく、戻り値があるメソッドの利用方法
 */
public class Sample02 {

	public static void main(String[] args) {
		int result = f();
		System.out.println(result);
	}

	static int f() {
		int x = 10;
		return 2 * x;
	}

}
