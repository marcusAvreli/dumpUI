package dumpUI.components.itemslist;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dumpUI.components.tableModel.MyStoredProcedureTableModel;
import dumpUI.entity.Entity;
import dumpUI.entity.MyStoredProcedure;
import dumpUI.model.ModelObserver;
import dumpUI.view.GUI;

/**
 *
 * @author mjcobo
 */
public class MyStoredProcedureListPanel 
extends GenericDynamicItemsListPanel<MyStoredProcedure> implements ModelObserver{

  /***************************************************************************/
  /*                        Private attributes                               */
  /***************************************************************************/
	private static final Logger logger = LoggerFactory.getLogger(MyStoredProcedureListPanel.class);
  /***************************************************************************/
  /*                            Constructors                                 */
  /***************************************************************************/  

  /**
   * 
   * @param tableModel 
   */
  public MyStoredProcedureListPanel() {
    super(new MyStoredProcedureTableModel());
    logger.info("before adding addAffiliationObserver");
    GUI view = GUI.getInstance();
    view.addObserver(this);
   // CurrentProject.getInstance().getKbObserver().addAffiliationObserver(this);
  }
  
  /***************************************************************************/
  /*                           Public Methods                                */
  /***************************************************************************/

  /**
   * 
   * @param items
   * @throws KnowledgeBaseException 
   */
  public void entityAdded(ArrayList<MyStoredProcedure> items)  {
    
    addItems(items);
  }

  /**
   * 
   * @param items
   * @throws KnowledgeBaseException 
   */
  public void entityRemoved(ArrayList<MyStoredProcedure> items) {
    removeItems(items);
  }

  /**
   * 
   * @param items
   * @throws KnowledgeBaseException 
   */
  public void entityUpdated(ArrayList<MyStoredProcedure> items) {
    updateItems(items);
  }

@Override
public void receivedMessageEvent(List reply) {
	// TODO Auto-generated method stub
	 addItems((ArrayList<MyStoredProcedure>) reply);
	
}

@Override
public void exceptionEvent(String message) {
	// TODO Auto-generated method stub
	
}



 
}
