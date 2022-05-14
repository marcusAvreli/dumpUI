package dumpUI.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dumpUI.App;
import dumpUI.ShowManagerTask;
import dumpUI.components.adddialog.AddDialogManager;
import dumpUI.components.adddialog.AddMyStoredProcedureDialog;
import dumpUI.components.manager.MyStoredProcedureManager;
import dumpUI.entity.MyStoredProcedure;





@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	private static final Logger logger = LoggerFactory.getLogger(MainFrame.class);
	public final int VERTICAL_GAP = 10;
	public final int UNRESIZABLE_COMPENSATION = -10; // when you set the frame to setResizable(false), it causes a bug that changes the computations of the component sizes
	public final int NUM_OF_FLOORS = 2;
	public final int PARKING_SPOT_WIDTH = 42; // in pixels
	public final int PARKING_SPOT_HEIGHT = 82; // in pixels
	private final MyStoredProcedureManager affiliationManger = new MyStoredProcedureManager();
	
	
	private LinkedList<GUIObserver> observers;
	private GUI parent;
	private JPanel actionsPanel;
	

	
	public MainFrame(final GUI parent) {
		
		this.parent = parent;
		observers = parent.getObservers();
		constructActionsPanel();
		//AddDialogManager.getInstance().init(this);		
		add(actionsPanel, BorderLayout.EAST);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	
	private void constructActionsPanel() {
		final int DEFAULT_BUTTON_WIDTH = 120;
		final int DEFAULT_BUTTON_HEIGHT = 50;
		Dimension buttonDimension = new Dimension(DEFAULT_BUTTON_WIDTH, DEFAULT_BUTTON_HEIGHT);
		actionsPanel = new JPanel(new GridLayout(1, 1, 0, VERTICAL_GAP));
		(new ShowManagerTask(this.actionsPanel, this.affiliationManger)).execute();
		JButton logoutBtn = new JButton("Log Out");
		logoutBtn.addActionListener(new LoginListener());
		logoutBtn.setPreferredSize(buttonDimension);
		//actionsPanel.add(logoutBtn);
		
	}
	
	private class LoginListener implements ActionListener {
		@Override 
		public void actionPerformed(ActionEvent e) {
			LinkedList<GUIObserver> observers = parent.getObservers();
			
			//logger.info("add event called");
			
			for (GUIObserver observer : observers)
				observer.addEvent();
		}
	}
	
	
	
}
