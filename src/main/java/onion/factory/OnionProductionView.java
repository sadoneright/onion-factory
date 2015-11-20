package onion.factory;

import java.util.List;

import onion.factory.core.domain.Onion;
import onion.factory.infrastructure.ICallback;
import onion.factory.infrastructure.Logger;

public class OnionProductionView {

	public void Update(List<Onion> onions) {
		int count = 0;

		for (Onion onion : onions) {
			count++;
			Logger.log("Updating view for onion " + count + "and id " + onion.getId());
		}
	}

	public void clickOpenFactory(ICallback iCallback) {
		iCallback.call();
	}

	public void clickProduceOnion(ICallback iCallback) {
		iCallback.call();
	}
}
