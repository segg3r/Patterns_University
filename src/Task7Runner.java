import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import task7.blog.Blog;
import task7.iterator2enumeration.IteratorEnumeration;

public class Task7Runner {

	public static void main(String[] args) {
		// Adapter
		List<String> stringList = new ArrayList<String>();
		stringList.add("Hello");
		stringList.add(",");
		stringList.add(" world");
		stringList.add("!");

		Iterator<String> stringIterator = stringList.iterator();
		while (stringIterator.hasNext()) {
			System.out.print(stringIterator.next());
		}

		System.out.println();

		Enumeration<String> stringEnum = new IteratorEnumeration<String>(
				stringList.iterator());
		while (stringEnum.hasMoreElements()) {
			System.out.print(stringEnum.nextElement());
		}

		System.out.println();

		// Facade
		Blog blog = new Blog();
		if (blog.authorize("server", "pasha", "123")) {
			blog.getPostList();
			blog.loadPost();
			String postText = blog.getBlogPostText();
			if (blog.isSpellCheckComplete(postText)) {
				blog.publish();
				blog.deletePost();
			} else {
				System.out.println("Validation failed");
			}
		} else {
			System.out.println("Authorization failed");
		}
	}

}
