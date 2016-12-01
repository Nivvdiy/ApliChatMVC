package dta.chat.view.console;

import java.util.ArrayList;
import java.util.List;

import dta.chat.model.ChatMessage;
import dta.chat.model.observer.ChatObserver;

public abstract class ViewComposite implements ChatObserver<ChatMessage> {

	protected List<ViewComposite> children = new ArrayList<ViewComposite>();

	public void print() {
		children.forEach(ViewComposite::print);
	}
}