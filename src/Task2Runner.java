import task2.impl.Airplane;
import task2.impl.observers.CoordsObserver;
import task2.impl.observers.RotationObserver;

public class Task2Runner {

	public static void main(String[] args) {

		Airplane airplane = new Airplane();
		new CoordsObserver(airplane);
		new RotationObserver(airplane);

		airplane.setData(5, 5, 2, 4, 22);
		airplane.setData(0, 1, 4, 5, 12);

	}

}
