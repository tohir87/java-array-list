package __arrayList;

import java.util.*;

class Stock {
	 private ArrayList<StItem> stock = new ArrayList<StItem>();
	  public boolean add(StItem st){
	  	// add a new item ensuring that its code number does not already
	    // exist in stock
		 //return stock.contains(st) ? false : stock.add(st);
		 Boolean found = false;
			for(StItem s : stock) {
			    if(s!=null && st.getCode().toLowerCase().equals(s.getCode().toLowerCase())) {
			        found = true;
			    }
			}
			return found ? false : stock.add(st);
	  }
	  
	  public boolean search(String cd){
	  	// return true if an item with code cd exists in stock; 
	    // false otherwise
		  Boolean found = false;
			for(StItem s : stock) {
			    if(s!=null && cd.toLowerCase().equals(s.getCode().toLowerCase())) {
			        found = true;
			    }
			}
			return found;
	  }
	  
	  public StItem getItem(String cd){
		  // return the stock item whose code number is cd
		  StItem find = null;
			for (StItem st : stock) {
				if (cd.toLowerCase().equals(st.getCode().toLowerCase())){
					find = st;
				}
			}
			return find;
		 
	  }
		  
	  public int size(){
		  // return current number of items in stock
		  return stock.size();
	  }
	  
	  public int totalStock(){
		  // calculate total stock numbers
		  int totalStock = 0;
		  for (StItem st : stock) {
			  if (st != null){
				  totalStock =+ st.getQuantity();
			  }
		  }
		  return totalStock;
	  }
	  
	  public String[] getNames(){
		  // return the names of all items in stock
		  ArrayList<String> list = new ArrayList<String>();
		  for (StItem st : stock) {
			  if (st != null){
				  list.add(st.getName());
			  }
		  }
		  return (String[]) list.toArray();
	  }


}
