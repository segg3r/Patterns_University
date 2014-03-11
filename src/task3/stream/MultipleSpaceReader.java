package task3.stream;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class MultipleSpaceReader extends FilterReader {

	protected MultipleSpaceReader(Reader in) {
		super(in);
	}

	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toUpperCase((char) c));
	}

	public int read(char[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset + result; i++) {
			b[i] = Character.toUpperCase(b[i]);
		}
		return result;
	}

}
