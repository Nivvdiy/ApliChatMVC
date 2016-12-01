package dta.chat.view.console;

import dta.chat.model.ChatMessage;
import dta.chat.model.observer.ChatObserver;

public class ChatConsoleTitleView extends ViewComposite implements ChatObserver<ChatMessage> {

	@Override
	public void print() {
		System.out.println("= CHAT APP =");
	}

	@Override
	public void update(ChatMessage obj) {
		// TODO Auto-generated method stub

	}
}