package task7.iterator2enumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration<T> implements Enumeration<T> {

	private Iterator<T> iterator;

	public IteratorEnumeration(Iterator<T> iterator) {
		super();
		this.iterator = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public T nextElement() {
		return iterator.next();
	}

}
