package onion.factory.core.ONE_appservices;

import java.util.List;

import onion.factory.core.THREE_domain.Factory;
import onion.factory.core.THREE_domain.FactoryName;
import onion.factory.core.THREE_domain.Onion;
import onion.factory.core.THREE_domain.OnionQuantity;

public interface IOnionProductionApplicationService {

	Factory openFactory(Long factoryId, FactoryName factoryName);

	List<Onion> produceOnions(Long factoryId, OnionQuantity quanity);
}
