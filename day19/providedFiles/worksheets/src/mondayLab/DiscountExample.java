package mondayLab;

import java.util.Arrays;
import java.util.List;
import java.math.BigDecimal;

public class DiscountExample {

	public static void main(String[] args) {
		final List<BigDecimal> prices = Arrays.asList(
				new BigDecimal("10"), new BigDecimal("30"),
				new BigDecimal("17"), new BigDecimal("20"),
				new BigDecimal("15"), new BigDecimal("35")
		); 
	
/*		BigDecimal totalOfDiscountPrices = BigDecimal.ZERO;
		
		for( BigDecimal price : prices) {
			if(price.compareTo(BigDecimal.valueOf(20)) > 0) {
				totalOfDiscountPrices = 
						totalOfDiscountPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
			}
		}
		System.out.println("Total of discounted prices is" + totalOfDiscountPrices);
*/		
		final BigDecimal totalOfDiscountPrices =
				prices.stream()
					.filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
					.map(price -> price.multiply(BigDecimal.valueOf(0.9)))
					.reduce(BigDecimal.ZERO, BigDecimal::add);
				
		System.out.println("Total of discounted prices is " + totalOfDiscountPrices);		
	}
	
	
}
