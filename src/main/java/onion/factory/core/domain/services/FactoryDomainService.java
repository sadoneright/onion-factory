package onion.factory.core.domain.services;

import java.util.List;

import onion.factory.core.domain.Factory;
import onion.factory.core.domain.FactoryName;
import onion.factory.core.domain.IFactoryOpened;
import onion.factory.core.domain.Onion;

public class FactoryDomainService implements IFactoryDomainService {

	private IFactoryRepository repository;

	private IFactoryOpened factoryOpened;

	public FactoryDomainService(IFactoryRepository repository, IFactoryOpened factoryOpened) {
		this.factoryOpened = factoryOpened;
		this.repository = repository;
	}

	public Factory OpenFactory(Long factoryId, FactoryName name) {
		Factory factory = new Factory(factoryId, name);

		factory.Open(this.factoryOpened);

		this.repository.save(factory);

		return factory;
	}

	public void AssignProducedOnions(Long factoryId, List<Onion> producedOnions) {
		   Factory factory = this.repository.load(factoryId);

           factory.Assign(producedOnions);

           this.repository.update(factory);
	}

}
