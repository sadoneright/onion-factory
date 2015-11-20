package onion.factory.core.TWO_domainservices;

import java.util.List;

import onion.factory.core.THREE_domain.Factory;
import onion.factory.core.THREE_domain.FactoryName;
import onion.factory.core.THREE_domain.IFactoryOpened;
import onion.factory.core.THREE_domain.Onion;

public class FactoryDomainService implements IFactoryDomainService {

	private IFactoryRepository repository;

	private IFactoryOpened factoryOpened;

	public FactoryDomainService(IFactoryRepository repository, IFactoryOpened factoryOpened) {
		this.factoryOpened = factoryOpened;
		this.repository = repository;
	}

	public Factory openFactory(Long factoryId, FactoryName name) {
		Factory factory = new Factory(factoryId, name);

		factory.open(this.factoryOpened);

		this.repository.save(factory);

		return factory;
	}

	public void assignProducedOnions(Long factoryId, List<Onion> producedOnions) {
		Factory factory = this.repository.load(factoryId);

		factory.assign(producedOnions);

		this.repository.update(factory);
	}

}
