package MyApp;

import java.time.LocalDate;

public class ProductMain {

	public static void main(String[] args) {
		
		
		Product product1 = new Product();
		product1.setProductId(1001);
		product1.setProductName("phonyx");
		product1.setProductPrice(56000);
		product1.setMfd(LocalDate.of(2024, 03, 10));
		product1.setCategory("mobile");
		
		System.out.println("Product Deatils");
		System.out.println("Id  :"+product1.getProductId());
		System.out.println("producName:" +product1.getProductName());
		System.out.println("ProductPrice:"+product1.getProductPrice());
		System.out.println("mfd:"+product1.getMfd());
		System.out.println("Category:" +product1.getCategory());
		
		Product product2 = new Product(1002,"yohonyx",56000,LocalDate.of(2024, 03, 10),"tv");
		
		System.out.println("Product Deatils");
		System.out.println("Id  :"+product2.getProductId());
		System.out.println("producName:" +product2.getProductName());
		System.out.println("ProductPrice:"+product2.getProductPrice());
		System.out.println("mfd:"+product2.getMfd());
		System.out.println("Category:" +product2.getCategory());
		
	}

}
