package task3.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class InputTest {

	public static void main(String[] args) {
		int c;
		try {
			Reader in = new MultipleSpaceReader(new LowerCaseReader(
					new BufferedReader(new FileReader("test.txt"))));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			System.out.println();
			//
			in = new UpperCaseReader(new BufferedReader(new FileReader(
					"test.txt")));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			System.out.println();
			//
			in = new MultipleSpaceReader(new LowerCaseReader(
					new BufferedReader(new FileReader("test.txt"))));
			int maxLength = 1000;
			char[] chars = new char[maxLength];
			int read = in.read(chars, 0, maxLength);
			System.out.println(new String(chars, 0, read));
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
