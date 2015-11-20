package onion.factory.dr;

import onion.factory.core.app.services.IOnionProductionApplicationService;
import onion.factory.core.app.services.OnionProductionApplicationService;
import onion.factory.core.domain.services.FactoryDomainService;
import onion.factory.core.domain.services.OnionDomainService;
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
