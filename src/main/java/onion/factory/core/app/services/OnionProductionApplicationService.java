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

	public Factory OpenFactory(Long factoryId, FactoryName factoryName) {
		Factory factory = this.factoryDomainService.OpenFactory(factoryId, factoryName);

		return factory;
	}

	public List<Onion> ProduceOnions(Long factoryId, OnionQuantity quanity) {
		List<Onion> produceOnions = this.onionDomainService.ProduceOnions(quanity);

		this.factoryDomainService.AssignProducedOnions(factoryId, produceOnions);

		return produceOnions;
	}

}
