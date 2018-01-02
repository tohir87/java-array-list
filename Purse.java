package __arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Purse {
	private ArrayList<Coin> purse = new ArrayList<>();

	public void add(Coin c) {
		// add new coin to purse
		purse.add(c);
	}

	public int sumCoins() {
		// Calculates total value of all coins in the purse
		int sum = 0;
		for (Coin c : purse) {
			if (c != null) {
				sum += c.getValue();
			}
		}
		return sum;
	}

	public Coin mostValuable() {
		// returns the most valuable coin in the purse
		Coin mostValuable = new Coin(0);
		for (Coin c : purse) {
			if (c.getValue() > mostValuable.getValue()) {
				mostValuable = c;
			}
		}
		return mostValuable;
	}

	public boolean search(Coin c) {
		// searches the list for the given coin and returns
		// true if found; false otherwise
		Boolean find = false;
		for (Coin co : purse) {
			if (co.getValue() == c.getValue()) {
				find = true;
			}
		}
		return find;
	}

	public boolean check(int amount) {
		// returns true if the purse contains at least
		// the given amount of money
		return sumCoins() >= amount;
	}

	public String toString() {
		// returns a string representing the list of coins
		return purse.toString();
	}

	public String sortedPurse() {
		// sorts the list of coins
		Collections.sort(purse);
		return purse.toString();
	}

}
