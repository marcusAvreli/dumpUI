package dumpUI.Controller;

import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dumpUI.App;
import dumpUI.entity.Entity;
import dumpUI.entity.MyStoredProcedure;
import dumpUI.model.Model;
import dumpUI.model.ModelObserver;
import dumpUI.view.GUI;
import dumpUI.view.GUIObserver;

public class Controller extends Thread implements GUIObserver, ModelObserver {
	private static final Logger logger = LoggerFactory.getLogger(Controller.class);
	public final int OPERATOR_PERMISSION = 2;
	private GUI view;
	private Model model;
	private String serverIP;

	private boolean moreExpiredUsers;
	private boolean stopRunning;

	public Controller() {
		view = GUI.getInstance();
		view.launchMainFrame();
		view.addObserver(this);
		model = new Model();
		model.addObserver(this);
		start();
	}

	private void handleLoginReply() {
		view.launchMainFrame();

	}

	@Override
	public void addEvent() {
		//logger.info("add event received");
		Entity entity = new MyStoredProcedure();
		entity.setId(1);
		model.addRequest(entity);
	}

	@Override
	public void receivedMessageEvent(List reply) {
		// TODO Auto-generated method stub
		logger.info("model updated:"+reply.size());
		
	}

	@Override
	public void exceptionEvent(String message) {
		// TODO Auto-generated method stub
		
	}

}
