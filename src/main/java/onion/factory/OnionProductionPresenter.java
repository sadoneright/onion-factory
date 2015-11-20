package onion.factory;

import java.util.List;
import java.util.Random;

import javax.swing.plaf.IconUIResource;

import onion.factory.core.ONE_appservices.IOnionProductionApplicationService;
import onion.factory.core.THREE_domain.FactoryName;
import onion.factory.core.THREE_domain.Onion;
import onion.factory.core.THREE_domain.OnionQuantity;
import onion.factory.infrastructure.ICallback;
import onion.factory.infrastructure.Logger;

public class OnionProductionPresenter {
	private OnionProductionView view;

	private IOnionProductionApplicationService onionProductionApplicationService;

	public OnionProductionPresenter(OnionProductionView view,
			IOnionProductionApplicationService onionProductionApplicationService) {
		this.onionProductionApplicationService = onionProductionApplicationService;
		this.view = view;
	}

	public ICallback handleOpenFactoryClicked = new ICallback() {
		public void call() {
			handleOpenFactoryClicked();
		}
	};

	public ICallback handleProduceOnionClicked = new ICallback() {

		public void call() {
			handleProduceOnionClicked();
		}
	};

	public void initialize() {
		Logger.log("Initializing presenter");

	}

	Random rand = new Random();
	Long factoryId = rand.nextLong();

	public void handleProduceOnionClicked() {
		Logger.log("Handling Produce Onion Clicked Event");

		OnionQuantity onionQuantity = new OnionQuantity(rand.nextInt(255));

		List<Onion> onions = this.onionProductionApplicationService.produceOnions(factoryId, onionQuantity);

		this.view.Update(onions);
	}

	public void handleOpenFactoryClicked() {
		Logger.log("Handling Open Factory Clicked Event");

		FactoryName factoryName = new FactoryName("TEst");

		this.onionProductionApplicationService.openFactory(factoryId, factoryName);
	}
}
