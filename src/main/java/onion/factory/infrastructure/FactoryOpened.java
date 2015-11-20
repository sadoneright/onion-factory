package onion.factory.infrastructure;

import java.util.Date;

import onion.factory.core.domain.IFactoryOpened;

public class FactoryOpened implements IFactoryOpened{

	public Long at() {
		return SystemClock.now();
	}
}
