package onion.factory.dependency.resolution;

import onion.factory.core.ONE_appservices.IOnionProductionApplicationService;
import onion.factory.core.ONE_appservices.OnionProductionApplicationService;
import onion.factory.core.TWO_domainservices.FactoryDomainService;
import onion.factory.core.TWO_domainservices.OnionDomainService;
import onion.factory.infrastructure.FactoryOpened;
import onion.factory.infrastructure.FactoryRepository;
import onion.factory.infrastructure.OnionRepository;

public class WireCore {
	public static IOnionProductionApplicationService up() {
		return new OnionProductionApplicationService(
				new FactoryDomainService(new FactoryRepository(), new FactoryOpened()),
				new OnionDomainService(new OnionRepository()));
	}
}
