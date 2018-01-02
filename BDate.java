package __arrayList;

import java.util.Date;

public class BDate {
	private Date birthDate;
	
	public BDate(Date birthDate) {
		super();
		this.birthDate = birthDate;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "BDate [birthDate=" + birthDate + "]";
	}

	
	
}
