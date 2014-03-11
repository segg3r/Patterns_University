package task2.impl;

import java.util.ArrayList;
import java.util.List;

import task2.interfaces.Observable;
import task2.interfaces.Observer;

public class Airplane implements Observable {

	private List<Observer> observers;

	private int x;
	private int y;
	private int z;
	private int rot1;
	private int rot2;

	public Airplane() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(x, y, z, rot1, rot2);
		}
	}

	public void setData(int x, int y, int z, int rot1, int rot2) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.rot1 = rot1;
		this.rot2 = rot2;
		notifyObservers();
	}

}
