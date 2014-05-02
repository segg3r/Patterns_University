import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import task3.stream.LowerCaseReader;
import task3.stream.MultipleSpaceReader;
import task3.stream.UpperCaseReader;

public class Task3InputRunner {

	public static void main(String[] args) {
		int c;
		try {
			// Multiple space character by character
			Reader in = new MultipleSpaceReader(new LowerCaseReader(
					new BufferedReader(new FileReader("test.txt"))));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			System.out.println();
			// Upper case
			in = new UpperCaseReader(new BufferedReader(new FileReader(
					"test.txt")));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			System.out.println();
			// Multiple space all characters
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
