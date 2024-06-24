import java.util.Scanner;

public class Sample14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("０以上の数値を入力してください。 -> ");
		int data = sc.nextInt();

		if (data < 0) {
			System.out.println("０以上の数値ではありません。");
			System.exit(1);
		}

		System.out.println("入力した数値 : " + data);
	}
}
