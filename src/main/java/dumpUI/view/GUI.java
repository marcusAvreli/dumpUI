package dumpUI.view;

import java.awt.Window;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;





public class GUI {
	
	private MainFrame mainFrame;
	
	private Window activeWindow;
	private LinkedList<GUIObserver> observers; 
	
	
	public GUI() {
		mainFrame = null;		
		observers = new LinkedList<GUIObserver>();		
	}
	
	
	public void addObserver(GUIObserver observer) {
		observers.add(observer);
	}
	
	
	public void removeObserver(GUIObserver observer) {
		observers.remove(observer);
	}
	
	
	public void displayError(String errorMsg, String title) {
		JOptionPane.showMessageDialog(activeWindow, errorMsg, title, JOptionPane.ERROR_MESSAGE);
	}
	
	
	public void displayNotice(String msg, String title) {
		JOptionPane.showMessageDialog(activeWindow, msg, title, JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public void launchMainFrame() {
		activeWindow = mainFrame = new MainFrame(this);
		
		
	}
	public static GUI getInstance() {
	    return GUISingleton.INSTANCE;
	  }

	  /**
	   * 
	   */
	  private static class GUISingleton {
	    private static final GUI INSTANCE = new GUI();
	  }

	
	

	
	
	
	
	
	
	
	
	
	
	Window getActiveWindow() {
		return activeWindow;
	}
	
	LinkedList<GUIObserver> getObservers() {
		return observers;
	}
	
	JFrame getMainFrame() {
		return mainFrame;
	}
}
