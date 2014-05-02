package task7.blog.entities;

import java.util.ArrayList;
import java.util.List;

public class BlogPostStorage {

	private List<BlogPost> blogPosts;

	public BlogPostStorage() {
		super();
		this.blogPosts = new ArrayList<BlogPost>();
	}

	public void getPostList() {
		blogPosts.add(new BlogPost("properties", "Hello"));
	}

	public BlogPost loadPost() {
		return blogPosts.get(0);
	}

	public void publish(BlogPost blogPost) {
		System.out.println("Publishing " + blogPost.getText());
	}

	public void deletePost() {
		blogPosts.remove(0);
	}
}
