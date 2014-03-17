package task3.stream;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class MultipleSpaceReader extends FilterReader {

	private boolean returnSavedChar;
	private char savedChar;

	public MultipleSpaceReader(Reader in) {
		super(in);
	}

	public int read() throws IOException {
		if (returnSavedChar) {
			returnSavedChar = false;
			return savedChar;
		}
		int c = super.read();
		if (c == -1) {
			return c;
		}
		char ch = (char) c;
		if (ch == '\t' || ch == ' ') {
			readWhileNotSpace();
			return ' ';
		}
		return ch;
	}

	private void readWhileNotSpace() throws IOException {
		while (true) {
			int read = super.read();
			if (read == -1) {
				return;
			}
			char ch = (char) read;
			if (ch != '\t' && ch != ' ') {
				returnSavedChar = true;
				savedChar = ch;
				return;
			}
		}
	}

	public int read(char[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		String initialRead = new String(b, offset, result);
		String resultString = initialRead.replaceAll("[\t ]+", " ");
		int length = resultString.length();
		for (int i = offset; i < offset + length; i++) {
			b[i] = resultString.charAt(i - offset);
		}

		return length;
	}

}
