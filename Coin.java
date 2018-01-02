package __arrayList;

public class Coin implements Comparable<Coin> {
	
	private int value;	

	public Coin(int value) {
		super();
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "\nCoin [value=" + value + "]";
	}

	@Override
	public int compareTo(Coin c) {
		return this.value - c.getValue();
	}
	

}
