package task2.impl.observers;

import task2.impl.Airplane;
import task2.interfaces.Observer;

public class CoordsObserver implements Observer {

	public CoordsObserver(Airplane airplane) {
		airplane.addObserver(this);
	}

	@Override
	public void update(int x, int y, int z, int rot1, int rot2) {
		System.out.println("Coords: " + x + ";" + y + ";" + z);
	}

}
