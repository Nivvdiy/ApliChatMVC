package dta.chat.view.console;

import dta.chat.model.ChatMessage;
import dta.chat.model.observer.ChatObserver;

public class ChatConsoleConversationView extends ViewComposite implements ChatObserver<ChatMessage> {

	private String login;

	public void sayWelcome(String login) {
		this.login = login;
	}

	public void update(String msg) {
		System.out.println(msg);
	}

	@Override
	public void print() {
		System.out.println("== Conversations ==");
		System.out.println("Welcome : " + login);
	}

	@Override
	public void update(ChatMessage obj) {

	}
}