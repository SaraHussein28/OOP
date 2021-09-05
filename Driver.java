package Android;

public class Driver {

	private String name; 
	private int mobileNumber; 
	private double driverRating;
	private int numberOfCompletedTrips; 

	
	public Driver(String name, int mobileNumber, double driverRating, int numberOfCompletedTrips) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.driverRating = driverRating;
		this.numberOfCompletedTrips = numberOfCompletedTrips;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public double getDriverRating() {
		return driverRating;
	}
	
	public void setDriverRating(double driverRating) {
		this.driverRating = driverRating;
	}
	
	public int getNumberOfCompletedTrips() {
		return numberOfCompletedTrips;
	}
	
	public void setNumberOfCompletedTrips(int numberOfCompletedTrips) {
		this.numberOfCompletedTrips = numberOfCompletedTrips;
	}

}
