package task3.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class InputTest {

	public static void main(String[] args) {
		int c;
		try {
			Reader in = new LowerCaseReader(new BufferedReader(new FileReader(
					"test.txt")));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}

			in = new UpperCaseReader(new BufferedReader(new FileReader(
					"test.txt")));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
