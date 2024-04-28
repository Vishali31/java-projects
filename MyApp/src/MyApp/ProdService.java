package MyApp;

import java.util.Scanner;

public class ProdService {

	public static void main(String[] args) {

		ProdServices p = new ProdServices();

		Prod1 p1 = new Prod1();
		p1.setProductId("1001");
		p1.setName("IphoneX");
		p1.setPrice(65000);

		Prod1 p2 = new Prod1();
		p2.setProductId("1002");
		p2.setName("SonyXP");
		p2.setPrice(85000);

		Prod1 p3 = new Prod1();
		p3.setProductId("1003");
		p3.setName("ScanDisk");
		p3.setPrice(2000);

		p.addProduct(p1);
		p.addProduct(p2);
		p.addProduct(p3);

		p.listProducts();
		System.out.println("To Update product price");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your prductId : ");
		String productId = sc.next();
		System.out.println("Enter your price : ");
		double price = sc.nextDouble();

		p.upDatePrice(productId, price);
		double newPrice = p.upDatePrice(productId, price);
		System.out.println(newPrice);

		p.listProducts();
	}

}
