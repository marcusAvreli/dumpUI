package dumpUI.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import dumpUI.entity.Entity;







public class Model {
	private LinkedList<ModelObserver> observers;
	public List<Entity> entities;
	public Model() {
		observers = new LinkedList<ModelObserver>();
		entities = new ArrayList<Entity>();
	}
	
	public void addObserver(ModelObserver observer) {
		synchronized(observers) {
			observers.add(observer);
		}
	}
	
	public void removeObserver(ModelObserver observer) {
		synchronized(observers) {
			observers.remove(observer);
		}
	}
	public void addRequest(Entity request) {
		entities.add(request);
		fireMessageReceived(entities);
	}
	void fireMessageReceived(List<Entity> reply) {
		for (ModelObserver observer : observers)
			observer.receivedMessageEvent(reply);
	}
}
