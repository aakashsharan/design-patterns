package cloud.aakashsharan;

import java.math.BigDecimal;

import org.junit.Test;

import cloud.aakashsharan.observable.Product;
import cloud.aakashsharan.observer.Bidder;

public class ApplicationTest {
	
	@Test
	public void testObserver() throws Exception{
		Product product = new Product("Nike Training Shoes", new BigDecimal(120));
		Bidder bidder1 = new Bidder("Rob Anderson");
		Bidder bidder2 = new Bidder("Steve Lowry");
		Bidder bidder3 = new Bidder("Vander Stein");
		product.addObserver(bidder1);
		product.addObserver(bidder2);
		product.addObserver(bidder3);
		product.setBidAmount(bidder1, new BigDecimal(160));
		product.deleteObserver(bidder2);
		product.setBidAmount(bidder3, new BigDecimal(165));;
		
	}
	

}
