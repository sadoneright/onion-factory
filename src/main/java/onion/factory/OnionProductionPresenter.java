package onion.factory;

import java.util.List;
import java.util.Random;

import javax.swing.plaf.IconUIResource;

import onion.factory.core.app.services.IOnionProductionApplicationService;
import onion.factory.core.domain.FactoryName;
import onion.factory.core.domain.Onion;
import onion.factory.core.domain.OnionQuantity;
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
			HandleOpenFactoryClicked();
		}
	};
	
	public ICallback handleProduceOnionClicked = new ICallback() {
		
		public void call() {
			HandleProduceOnionClicked();			
		}
	};
	public void Initialize() {
		Logger.Log("Initializing presenter");
		
	}
	Random rand = new Random();
	Long factoryId =rand.nextLong(); 
	public  void HandleProduceOnionClicked() {
		Logger.Log("Handling Produce Onion Clicked Event");
		
		
		OnionQuantity onionQuantity = new OnionQuantity(rand.nextInt(255));

		List<Onion> onions = this.onionProductionApplicationService.ProduceOnions(factoryId, onionQuantity);

		this.view.Update(onions);
	}

	public  void HandleOpenFactoryClicked() {
		Logger.Log("Handling Open Factory Clicked Event");

		FactoryName factoryName = new FactoryName("TEst");

		this.onionProductionApplicationService.OpenFactory(factoryId, factoryName);
	}
}
