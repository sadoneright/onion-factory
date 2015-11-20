package onion.factory.core.THREE_domain;

public class FactoryName {
	private String factoryName;

	public FactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public static String getName(FactoryName name) {
		return name.factoryName;
	}
}
