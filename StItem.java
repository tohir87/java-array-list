package __arrayList;

public class StItem {
	private String name;
	private String code;
	private int quantity;
	
	public StItem(String name, String code, int quantity) {
		super();
		this.name = name;
		this.code = code;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "\nStItem [name=" + name + ", code=" + code + ", quantity=" + quantity + "]";
	}
	
	
}
