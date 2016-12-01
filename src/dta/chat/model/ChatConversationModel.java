package dta.chat.model;

import dta.chat.model.observer.ChatObservable;

public class ChatConversationModel extends ChatObservable<ChatMessage> {

	private ChatMessage msg;

	public ChatMessage getChatMessage() {
		return msg;
	}

	public void setChatMessage(ChatMessage msg) {
		this.msg = msg;
	}

	public void setLogin(String login) {
		msg.setLogin(login);
	}

	public void sendMessage(String string) {

	}

}
