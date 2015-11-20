package onion.factory.core.ONE_appservices;

import java.util.List;

import onion.factory.core.THREE_domain.Factory;
import onion.factory.core.THREE_domain.FactoryName;
import onion.factory.core.THREE_domain.Onion;
import onion.factory.core.THREE_domain.OnionQuantity;
import onion.factory.core.TWO_domainservices.IFactoryDomainService;
import onion.factory.core.TWO_domainservices.IOnionDomainService;

public class OnionProductionApplicationService implements IOnionProductionApplicationService {

	private IFactoryDomainService factoryDomainService;

	private IOnionDomainService onionDomainService;

	public OnionProductionApplicationService(IFactoryDomainService factoryDomainService,
			IOnionDomainService onionDomainService) {
		this.onionDomainService = onionDomainService;
		this.factoryDomainService = factoryDomainService;
	}

	public Factory openFactory(Long factoryId, FactoryName factoryName) {
		Factory factory = this.factoryDomainService.openFactory(factoryId, factoryName);

		return factory;
	}

	public List<Onion> produceOnions(Long factoryId, OnionQuantity quanity) {
		List<Onion> produceOnions = this.onionDomainService.produceOnions(quanity);

		this.factoryDomainService.assignProducedOnions(factoryId, produceOnions);

		return produceOnions;
	}

}
