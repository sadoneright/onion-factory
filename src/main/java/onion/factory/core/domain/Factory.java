package onion.factory.core.domain;

import java.util.ArrayList;
import java.util.List;

public class Factory {

	Long id;

	FactoryName name;

	private Long opened;

	private List<Onion> producedOnions;

	public Factory(Long factoryId, FactoryName name) {
		this.id = factoryId;
		this.name = name;
		
		this.producedOnions = new ArrayList<Onion>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FactoryName getName() {
		return name;
	}

	public void setName(FactoryName name) {
		this.name = name;
	}

	public void open(IFactoryOpened factoryOpened) {
		this.opened = factoryOpened.at();
	}

	public void assign(List<Onion> producedOnions) {
		this.producedOnions.addAll(producedOnions);

	}

	public Long getOpened() {
		return opened;
	}

	public void setOpened(Long opened) {
		this.opened = opened;
	}

	public List<Onion> getProducedOnions() {
		return producedOnions;
	}

	public void setProducedOnions(List<Onion> producedOnions) {
		this.producedOnions = producedOnions;
	}

}
