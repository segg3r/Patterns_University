package task7.blog.entities;

public class SimpleSpellChecker {

	public boolean isSpellCheckComplete(String text) {
		return !text.contains("~");
	}

}
