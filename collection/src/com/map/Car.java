package com.map;


public class Car {
	
	int seat;

	public Car(int seat) {
		this.seat = seat;
	}

	@Override
	public int hashCode() {
		return seat%9;
	}

	@Override
	public String toString() {
		return seat+"";
	}

	

}
