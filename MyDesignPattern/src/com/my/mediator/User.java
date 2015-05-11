package com.my.mediator;

public abstract class User {

	private Mediator mediator;

	public abstract void work();

	public User(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

}
