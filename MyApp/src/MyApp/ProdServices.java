package MyApp;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ProdServices {

	private LinkedHashSet<Prod1> products = new LinkedHashSet<Prod1>();

	boolean addProduct(Prod1 product) {
		if (products.contains(product)) {
			return false;

		}
		products.add(product);

		return true;

	}

	double upDatePrice(String productId, double newPrice) {
		Iterator<Prod1> i = products.iterator();
		while (i.hasNext()) {

			Prod1 up = i.next();
			if (up.getProductId().equals(productId)) {
				up.setPrice(newPrice);
			}

		}
		return newPrice;
	}
	void listProducts(){

		Iterator<Prod1> i = products.iterator();
		
		System.out.println	(	"ID" + "\t" + "Name"+ "\t" +"Price" );
		System.out.println("-----------------------------------------");
		while (i.hasNext()) {

			Prod1 up = i.next();
			System.out.println(
					up.getProductId() + " " + up.getName() + " " + up.getPrice() );

		}
		System.out.println("-----------------------------------------");
	}
}
