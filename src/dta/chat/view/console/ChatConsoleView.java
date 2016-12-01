package dta.chat.view.console;

import java.util.Scanner;

import dta.chat.controller.ChatAuthController;
import dta.chat.model.ChatMessage;
import dta.chat.model.observer.ChatObserver;

public class ChatConsoleView extends ViewComposite implements ChatObserver<ChatMessage> {

	private ChatConsoleTitleView titleView;
	private ChatConsoleConversationView conversationView;
	private ChatConsoleLoginView loginView;

	public ChatConsoleView(Scanner sc) {
		this.titleView = new ChatConsoleTitleView();
		this.conversationView = new ChatConsoleConversationView();
		this.loginView = new ChatConsoleLoginView(sc);
		this.children.add(titleView);
		this.children.add(loginView);
		this.children.add(conversationView);
	}

	public void setAuthController(ChatAuthController chatAuthController) {
		loginView.setAuthController(chatAuthController);
	}

	public void setLogin(String login) {
		this.conversationView.sayWelcome(login);
	}

	@Override
	public void update(ChatMessage obj) {

	}
}