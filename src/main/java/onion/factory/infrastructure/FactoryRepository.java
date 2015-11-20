package onion.factory.infrastructure;

import onion.factory.core.domain.Factory;
import onion.factory.core.domain.services.IFactoryRepository;

public class FactoryRepository implements IFactoryRepository {

	public void save(Factory factory) {
		Database.Insert(factory.getId(), factory);
	}

	public Factory load(Long factoryId) {
		return (Factory) Database.Select(factoryId);
	}

	public void update(Factory factory) {
		Database.Update(factory.getId(), factory);
	}

}
