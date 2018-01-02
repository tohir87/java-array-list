package __arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthDays {
	private List<BDate> data = new ArrayList<>();
	
	public boolean add(BDate bd){
	   //add new BDAte to existing list, ensuring that the value of bd is not null
		if (bd == null)
			return false;
		return data.add(bd);
	}
	public boolean exists(BDate bd){
	   // return true if bd exists; false otherwise
		return data.contains(bd);
	}
	public boolean replace(BDate bd, BDate nbd){
	   //replace bd with nbd
		return data.set(data.indexOf(bd), nbd) != null;
		
	}
	public List<BDate> listByDate(){
	   //return a sorted list of birth dates
		Collections.sort(data, Collections.reverseOrder());
		
		return data;
	}
	
	// not implemented
	public List<BDate> listByYear(){
	    //return the list of birth days sorted by year
		return data;
	}
	
	// not implemented
	public List<BDate> givenYear(int year){
	   // return a list of birth days for the given year
		return data;
	} 

}
