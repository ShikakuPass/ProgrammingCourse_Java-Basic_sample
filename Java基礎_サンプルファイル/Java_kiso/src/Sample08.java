
public class Sample08 {
	public static void main(String[] args) {
		int x = 15;

		System.out.println("xは10以上で20以下？：" + (10 <= x && x <= 20));
		System.out.println("xは10以上で20以下？：" + !(10 > x || x > 20));
	}
}
