package onion.factory.core.domain;

public class OnionQuantity {
	private int numberOfOnions;

	public OnionQuantity(int numberOfOnions) {
		if (numberOfOnions < 1) {
			throw new IllegalArgumentException("numberOfOnions: " + numberOfOnions + " Should be greater than one.");
		}

		if (numberOfOnions > 255) {
			throw new IllegalArgumentException("numberOfOnions: " + numberOfOnions + " Should be smaller than 256.");
		}

		this.numberOfOnions = numberOfOnions;
	}

	public static int getQuantity(OnionQuantity quantity) {
		return quantity.numberOfOnions;
	}
}
