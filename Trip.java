package Android;

import java.util.Date;

public class Trip {

	private int price; 
	private static int availableSeats; 
	private Date departureDate;
	private Date arrivalDate;
	private Driver driver; 
	private String pickup;
	private String dropoff;
	private Car car;
	
	
	public Trip(int price, Date departureDate, Date arrivalDate, Driver driver, String pickup, String dropoff,Car car) {
		this.price = price;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.driver = driver;
		this.pickup = pickup;
		this.dropoff = dropoff;
		this.car = car;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableSeats() {
		return availableSeats;
	}

	public static void setAvailableSeats(int availableSeats) {
		Trip.availableSeats = availableSeats;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getPickup() {
		return pickup;
	}

	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

	public String getDropoff() {
		return dropoff;
	}

	public void setDropoff(String dropoff) {
		this.dropoff = dropoff;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String book() {
		if (availableSeats > 0) {
			
			availableSeats--;
			return "Trip is booked successfully";
		}
		else return "The trip is fully booked";
	}
	
	
	public void viewOnMap () {
	}
	
	public void addToFavourites () {
	}
	
}
