package dta.chat.view.console;

import java.util.Scanner;

import dta.chat.controller.ChatAuthController;
import dta.chat.model.ChatMessage;
import dta.chat.model.observer.ChatObserver;

public class ChatConsoleLoginView extends ViewComposite implements ChatObserver<ChatMessage> {

	private Scanner sc;
	private ChatAuthController ctrl;

	public ChatConsoleLoginView(Scanner sc) {
		super();
		this.sc = sc;
	}

	@Override
	public void print() {
		System.out.println("== Authentification ==");
		System.out.print("Veuillez saisir votre login : ");
		ctrl.authentificate(this.sc.next());
	}

	public void setAuthController(ChatAuthController controller) {
		this.ctrl = controller;
	}

	@Override
	public void update(ChatMessage obj) {
		// TODO Auto-generated method stub

	}

}