package onion.factory.core.app.services;

import java.util.List;

import onion.factory.core.domain.Factory;
import onion.factory.core.domain.FactoryName;
import onion.factory.core.domain.Onion;
import onion.factory.core.domain.OnionQuantity;

public interface IOnionProductionApplicationService {

	Factory OpenFactory(Long factoryId, FactoryName factoryName);

	List<Onion> ProduceOnions(Long factoryId, OnionQuantity quanity);
}
