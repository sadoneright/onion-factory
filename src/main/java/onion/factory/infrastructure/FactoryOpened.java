package onion.factory.infrastructure;

import java.util.Date;

import onion.factory.core.THREE_domain.IFactoryOpened;

public class FactoryOpened implements IFactoryOpened{

	public Long at() {
		return SystemClock.now();
	}
}
