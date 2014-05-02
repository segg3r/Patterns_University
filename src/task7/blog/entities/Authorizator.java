package task7.blog.entities;

import java.util.ArrayList;
import java.util.List;

public class Authorizator {

	private static final List<String> data;
	static {
		data = new ArrayList<String>();
		data.add("server; pasha; 123");
	}

	public boolean authorize(String server, String login, String password) {
		for (String credentials : data) {
			if (credentials.equals(server + "; " + login + "; " + password)) {
				return true;
			}
		}
		return false;
	}

}
