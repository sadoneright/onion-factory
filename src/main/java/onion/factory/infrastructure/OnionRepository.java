package onion.factory.infrastructure;

import onion.factory.core.domain.Onion;
import onion.factory.core.domain.services.IOnionRepository;

public class OnionRepository implements IOnionRepository {

	public void save(Onion onion) {
		Database.insert(onion.getId(), onion);
	}

}
