package task7.blog.entities;

public class BlogPost {

	private String properties;
	private String text;

	public BlogPost(String properties, String text) {
		super();
		this.properties = properties;
		this.text = text;
	}

	public String getProperties() {
		return properties;
	}

	public String getText() {
		return text;
	}

}
