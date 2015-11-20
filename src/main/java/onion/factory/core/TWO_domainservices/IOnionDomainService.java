package onion.factory.core.TWO_domainservices;

import java.util.List;

import onion.factory.core.THREE_domain.Onion;
import onion.factory.core.THREE_domain.OnionQuantity;

public interface IOnionDomainService {
	List<Onion> produceOnions(OnionQuantity quantity);
}
