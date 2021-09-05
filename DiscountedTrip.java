package Android;

import java.util.Date;

public class DiscountedTrip extends Trip {
	private String promoCode;
	
	public DiscountedTrip(int price, Date departureDate, Date arrivalDate, Driver driver, String pickup, String dropoff, Car car, double discountPercentage, String promoCode) {
		super(price, departureDate, arrivalDate, driver, pickup, dropoff, car);
		this.promoCode = promoCode;
	}
	
	private void calculatePriceAfterDiscount () {
		
	}
	
}
