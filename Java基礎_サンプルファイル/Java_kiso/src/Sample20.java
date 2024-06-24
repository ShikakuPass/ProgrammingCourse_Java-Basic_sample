import java.util.Scanner;

public class Sample20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int data;

		do {
			System.out.println("０より大きい数値を入力してください。 -> ");
			data = sc.nextInt();

			System.out.println(data);
		} while (data > 0);

		System.out.println("終了します。");
	}
}
