package onion.factory.core.domain.services;

import onion.factory.core.domain.Factory;

public interface IFactoryRepository {

	public void save(Factory factory);
	public Factory load(Long factoryId); 
	public void update(Factory factory);
}
