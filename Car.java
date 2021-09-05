package Android;

public class Car {

	private String carModel; 
	private String numberPlate; 
	private String color;
	

	public Car(String carModel, String numberPlate, String color) {
		super();
		this.carModel = carModel;
		this.numberPlate = numberPlate;
		this.color = color;
	}
	
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	} 
	
	
}
