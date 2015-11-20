package onion.factory.core.domain.services;

import java.util.List;

import onion.factory.core.domain.Onion;
import onion.factory.core.domain.OnionQuantity;

public interface IOnionDomainService {
	List<Onion> produceOnions(OnionQuantity quantity);
}
