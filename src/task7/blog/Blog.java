package task7.blog;

import task7.blog.entities.Authorizator;
import task7.blog.entities.BlogPost;
import task7.blog.entities.BlogPostStorage;
import task7.blog.entities.SimpleSpellChecker;

public class Blog {

	private Authorizator authorizator;
	private BlogPost blogPost;
	private BlogPostStorage blogPostStorage;
	private SimpleSpellChecker simpleSpellChecker;

	public Blog() {
		this.authorizator = new Authorizator();
		this.blogPostStorage = new BlogPostStorage();
		this.simpleSpellChecker = new SimpleSpellChecker();
	}

	public boolean authorize(String server, String login, String password) {
		return authorizator.authorize(server, login, password);
	}

	public void getPostList() {
		blogPostStorage.getPostList();
	}

	public void loadPost() {
		blogPost = blogPostStorage.loadPost();
	}

	public String getBlogPostText() {
		return blogPost.getText();
	}

	public boolean isSpellCheckComplete(String text) {
		return simpleSpellChecker.isSpellCheckComplete(text);
	}

	public void publish() {
		blogPostStorage.publish(blogPost);
	}

	public void deletePost() {
		blogPostStorage.deletePost();
	}

}
