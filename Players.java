package __arrayList;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Players {

	private ArrayList<Player> data = new ArrayList<Player>();
	
	public boolean add(Player p){
		// add a new player ensuring that the name does 
		//not exist in the data list
		Boolean found = false;
		for(Player pl : data) {
		    if(pl!=null && p.getName().toLowerCase().equals(pl.getName().toLowerCase())) {
		        found = true;
		    }
		}
		return found ? false : data.add(p);
	}
	
	public boolean upDateScore(String n, int sc){
	     // update the number of goals scored by player named n by sc
		Boolean status = false;
		for(Player p : data) {
		    if(p!=null && n.toLowerCase().equals(p.getName().toLowerCase())) {
		        p.setScore(sc);
		        return true;
		    }
		}
		return status;
	}
	public ArrayList<String> getTeam(String t){
	    //return a list of the names of the teams in the data list
		ArrayList<String> list = new ArrayList<String>();
		
		for (Player p : data){
			if (t.toLowerCase().equals(p.getTeam().toLowerCase())) {
				list.add(p.getName());
			}
		}
		
		return list;
	}
	
	public Player getPlayer(String n){
	   // retrieve a players details given the name n
		Player find = null;
		for (Player p : data) {
			if (n.toLowerCase().equals(p.getName().toLowerCase())){
				find = p;
			}
		}
		return find;
	}
	
	public int getNumPlayers(){
	   // return the number of players in the data list
		return data.size();
	}
	
	public int totalGoals(){
	    // calculate the total number of goals scored
		int totalGoals = 0;
		for(Player p: data){
			totalGoals += p.getScore();
		}
	    return totalGoals;
	}
	
	public void display(){
         Collections.sort(data);
	     System.out.println(data);
	}
	
	

}
