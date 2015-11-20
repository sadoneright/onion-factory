package onion.factory.core.TWO_domainservices;

import onion.factory.core.THREE_domain.Factory;

public interface IFactoryRepository {

	public void save(Factory factory);
	public Factory load(Long factoryId); 
	public void update(Factory factory);
}
