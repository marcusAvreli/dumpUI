package dumpUI.model;

import java.util.List;

import dumpUI.entity.Entity;
public interface ModelObserver<T extends Comparable<T>> {

	public void receivedMessageEvent(List<T> reply);
	
	public void exceptionEvent(String message);
}
