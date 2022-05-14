package dumpUI.components.manager;

import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import dumpUI.components.itemslist.GenericItemsListPanel;
import dumpUI.components.observer.SelectionObserver;



public abstract class GenericItemManagerPanel<E extends Comparable<E>> extends JPanel implements SelectionObserver {
	private static final Logger logger = LoggerFactory.getLogger(GenericItemManagerPanel.class);
	  /** Creates new form GenericItemManagerPanel */
	  public GenericItemManagerPanel(GenericItemsListPanel<E> genericItemsListPanel) {
	    
	    this.genericItemsListPanel = genericItemsListPanel;
	    

	    initComponents();

	    this.itemsListPanel.add(this.genericItemsListPanel);
	   
	   
	    
	  }

	
	  public void setMasterPanelTitle(String title) {

	    masterScrollPanel.setBorder(BorderFactory.createTitledBorder(title));
	  }

	 
	  public void setSlavePanelTitle(String title) {

	    slaveScrollPanel.setBorder(BorderFactory.createTitledBorder(title));
	  }


	  public void selectionChangeHappened(int[] selection) {
		  logger.info("Selection happend");
	    if (selection.length == 0) {

	     
	    } else if (selection.length == 1) {
	      
	     
	      
	    } else {

	     
	    }
	  }

	  public abstract void addAction();
	  
	  

	
	  @SuppressWarnings("unchecked")

	  private void initComponents() {

	    mainSplitPanel = new javax.swing.JSplitPane();
	    masterScrollPanel = new javax.swing.JScrollPane();
	    masterPanel = new javax.swing.JPanel();
	    itemsListPanel = new javax.swing.JPanel();
	    separator = new javax.swing.JSeparator();
	    addButton = new javax.swing.JButton();
	   
	  
	   
	  
	    slaveScrollPanel = new javax.swing.JScrollPane();

	    mainSplitPanel.setBorder(null);
	    mainSplitPanel.setDividerLocation(400);

	    masterScrollPanel.setBorder(BorderFactory.createTitledBorder(""));

	    itemsListPanel.setLayout(new BoxLayout(itemsListPanel, BoxLayout.LINE_AXIS));

	    addButton.setText("Add");
	    addButton.addActionListener(new java.awt.event.ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	        addButtonActionPerformed(evt);
	      }
	    });

	  

	   

	    GroupLayout masterPanelLayout = new GroupLayout(masterPanel);
	    /*masterPanel.setLayout(masterPanelLayout);
	    masterPanelLayout.setHorizontalGroup(
	      masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masterPanelLayout.createSequentialGroup()
	        .addContainerGap()
	        .addGroup(masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	          .addComponent(itemsListPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
	          .addGroup(masterPanelLayout.createSequentialGroup()
	            .addComponent(addButton)
	            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	           
	            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	            .addComponent(addButton))
	        .addContainerGap())
	        
	    );*/
	    masterPanelLayout.setVerticalGroup(
	      masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masterPanelLayout.createSequentialGroup()
	        .addComponent(itemsListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
	        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	        .addGroup(masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	         

	          .addComponent(addButton))
	        .addContainerGap())
	    );

	    masterScrollPanel.setViewportView(masterPanel);

	    mainSplitPanel.setLeftComponent(masterScrollPanel);

	    slaveScrollPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
	    mainSplitPanel.setRightComponent(slaveScrollPanel);

	    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	    this.setLayout(layout);
	    layout.setHorizontalGroup(
	      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	      .addComponent(mainSplitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
	    );
	    layout.setVerticalGroup(
	      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	      .addComponent(mainSplitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
	    );
	  }

	 
	  private void addButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
	    addAction();
	  }
	  
	  private void moveToButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_moveToButtonActionPerformed
	    
	  
	  }

	
	  private void deleteButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
	    
	  
	  }

	 
	  private JButton addButton;	 
	  private JPanel itemsListPanel;
	  private JSplitPane mainSplitPanel;
	  private JPanel masterPanel;
	  private JScrollPane masterScrollPanel;	 
	  private JSeparator separator;
	  private JScrollPane slaveScrollPanel;
	  private GenericItemsListPanel<E> genericItemsListPanel;
	 

	}