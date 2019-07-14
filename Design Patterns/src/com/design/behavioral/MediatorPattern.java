package com.design.behavioral;

import java.util.ArrayList;
import java.util.List;

public class MediatorPattern {

}

// mediator interface
interface ChatMediator {
	public void sendMessage(String msg, User user);

	public void addUser(User user);
}

// colleague
abstract class User {
	protected ChatMediator mediator;
	protected String name;

	public User(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);

}

class ChatMediatorImpl implements ChatMediator {

	List<User> users;

	public ChatMediatorImpl() {
		users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String msg, User user) {
		for (User member : users) {
			if (member != user) {
				member.receive(msg);
			}
		}
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}

}

class UserImpl extends User {

	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg) {
		System.out.println("User " + name + ": sending message :" + msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println("User " + name + ": receiving message :" + msg);
	}

}
