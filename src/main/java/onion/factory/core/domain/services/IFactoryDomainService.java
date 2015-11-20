package onion.factory.core.domain.services;

import java.util.List;

import onion.factory.core.domain.Factory;
import onion.factory.core.domain.FactoryName;
import onion.factory.core.domain.Onion;

public interface IFactoryDomainService {
	Factory openFactory(Long factoryId, FactoryName name);

	void assignProducedOnions(Long factoryId, List<Onion> producedOnions);
}
