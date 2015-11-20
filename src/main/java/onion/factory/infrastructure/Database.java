package onion.factory.infrastructure;

import java.util.HashMap;
import java.util.Map;

public class Database {
	private static Map<Object, Object> everything = new HashMap<Object, Object>();

	public static void Insert(Object id, Object entity) {
		everything.put(id, entity);
	}

	public static void Update(Object id, Object entity) {
		everything.put(id, entity);
	}

	public static Object Select(Object id) {
		Object value;
		value = everything.get(id);
		return value;
	}
}
