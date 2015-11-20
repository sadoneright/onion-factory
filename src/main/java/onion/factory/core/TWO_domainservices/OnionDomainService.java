package onion.factory.core.TWO_domainservices;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import onion.factory.core.THREE_domain.Onion;
import onion.factory.core.THREE_domain.OnionQuantity;

public class OnionDomainService implements IOnionDomainService {

	private IOnionRepository repository;

	public OnionDomainService(IOnionRepository repository) {
		this.repository = repository;
	}

	Random rand = new Random();
	public List<Onion> produceOnions(OnionQuantity quantity) {
		int counts = OnionQuantity.getQuantity(quantity);
		List<Onion> onions = new ArrayList<Onion>();
		for (int j = 0; j < counts; j++) {
			onions.add(new Onion(rand.nextLong()));
		}
		for (Onion onion : onions) {
			this.repository.save(onion);
		}

		return onions;
	}
}
