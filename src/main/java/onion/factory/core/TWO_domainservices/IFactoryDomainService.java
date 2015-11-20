package onion.factory.core.TWO_domainservices;

import java.util.List;

import onion.factory.core.THREE_domain.Factory;
import onion.factory.core.THREE_domain.FactoryName;
import onion.factory.core.THREE_domain.Onion;

public interface IFactoryDomainService {
	Factory openFactory(Long factoryId, FactoryName name);

	void assignProducedOnions(Long factoryId, List<Onion> producedOnions);
}
