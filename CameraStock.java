package __arrayList;

import java.util.ArrayList;

public class CameraStock {

	private ArrayList<Camera> stock = new ArrayList<>();

	public void add(Camera c) {
		// add new camera to list
		stock.add(c);
	}

	public boolean search(Camera c) {
		// searches the list for the given camera and returns
		// true if found; false otherwise
		Boolean found = false;
		for (Camera cam : stock) {
			if (c != null && cam.getMake().equals(c.getMake()) && cam.getModel().equals(c.getModel())) {
				found = true;
			}
		}
		return found;

	}

	public Camera getModel(String model) {
		// returns a camera that matches the given model,
		// if one exists
		Camera find = null;
		for (Camera cam : stock) {
			if (cam.getModel().toLowerCase().equals(model.toLowerCase())) {
				find = cam;
			}
		}
		return find;
	}

	public ArrayList<Camera> getMake(String make) {
		// return a list of camera that match the given make
		ArrayList<Camera> list = new ArrayList<Camera>();
		for (Camera cam : stock) {
			if (cam != null && cam.getMake().toLowerCase().equals(make.toLowerCase())) {
				list.add(cam);
			}
		}
		return list;
	}

	public int freqModel(String model) {
		// counts the number of cameras of a given model
		int count = 0;
		for (Camera cam : stock) {
			if (cam != null && cam.getModel().toLowerCase().equals(model.toLowerCase())) {
				++count;
			}
		}
		return count;
	}

	public ArrayList<Camera> getPriceRange(double lb, double ub) {
		// returns list of camera in a given price range
		ArrayList<Camera> list = new ArrayList<Camera>();
		for (Camera cam : stock) {
			if (cam != null && cam.getPrice() >= lb && cam.getPrice() <= ub) {
				list.add(cam);
			}
		}
		return list;
	}

	public String toString() {
		// returns a string representation of the complete stock
		return stock.toString();
	}

}
