package p05;

public class StartUp {
	public static void main(String[] args) {
		Product p1 = new Product("りんご", 300, 0.08);
		Product p2 = new Product("みかん", 200, 0.08);
		Product p3 = new Product("ぶどう", 400, 0.08);

		p1.displayInfo();
		p2.displayInfo();
		p3.displayInfo();

		Product.tax = 0.1;

		p1.displayInfo();
		p2.displayInfo();
		p3.displayInfo();
	}
}
