package com.tech.w09.mission;

public class ItemTrans {
	private int point;
	private int total;

	public void GetItem(String name) {

		if (name == "jump") {
			point = 1000;
			total += point;
		} else if (name == "Djump") {
			point = 3000;
			total += point;
		} else if (name == "kill") {
			point = 5000;
			total += point;
		}
	}

	public int getPoint() {
		return point;
	}

	public int getTotal() {
		return total;
	}

}
