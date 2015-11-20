package onion.factory.infrastructure;

import java.util.HashMap;
import java.util.Map;

public class Database {
	private static Map<Object, Object> everything = new HashMap<Object, Object>();

	public static void insert(Object id, Object entity) {
		everything.put(id, entity);
	}

	public static void update(Object id, Object entity) {
		everything.put(id, entity);
	}

	public static Object select(Object id) {
		Object value;
		value = everything.get(id);
		return value;
	}
}
