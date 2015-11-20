package onion.factory.core.app.services;

import java.util.List;

import onion.factory.core.domain.Factory;
import onion.factory.core.domain.FactoryName;
import onion.factory.core.domain.Onion;
import onion.factory.core.domain.OnionQuantity;
import onion.factory.core.domain.services.IFactoryDomainService;
import onion.factory.core.domain.services.IOnionDomainService;

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
