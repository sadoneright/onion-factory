package onion.factory.infrastructure;

import onion.factory.core.THREE_domain.Onion;
import onion.factory.core.TWO_domainservices.IOnionRepository;

public class OnionRepository implements IOnionRepository {

	public void save(Onion onion) {
		Database.insert(onion.getId(), onion);
	}

}
