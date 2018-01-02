package __arrayList;

public class Camera {
	private String model;
	private String make;
	private Double price;
	
	public Camera(String model, String make, double price) {
		super();
		this.model = model;
		this.make = make;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "\nCamera [model=" + model + ", make=" + make + ", price=" + price + "]";
	}
	
	
}
