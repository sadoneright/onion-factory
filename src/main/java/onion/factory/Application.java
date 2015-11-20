package onion.factory;

import onion.factory.dr.WireCore;

public class Application {

	private OnionProductionView view;
	private OnionProductionPresenter presenter;

	public Application() {

	}

	public void setUp() {
		this.view = new OnionProductionView();
		this.presenter = new OnionProductionPresenter(this.view, WireCore.up());
		this.presenter.initialize();
	}

	public void run() {
		this.view.clickOpenFactory(presenter.handleOpenFactoryClicked);
		this.view.clickProduceOnion(presenter.handleProduceOnionClicked);
	}

	public static void main(String[] args) {
		Application app = new Application();
		app.setUp();
		app.run();
	}
}
