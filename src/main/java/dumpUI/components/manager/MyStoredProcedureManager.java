package dumpUI.components.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dumpUI.components.adddialog.AddDialogManager;
import dumpUI.components.itemslist.MyStoredProcedureListPanel;

//import JoinEntitiesDialogManager;

import dumpUI.entity.MyStoredProcedure;

/**
 *
 * @author mjcobo
 */
public class MyStoredProcedureManager extends GenericItemManagerPanel<MyStoredProcedure> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(MyStoredProcedureManager.class);

  public MyStoredProcedureManager() {
    super(new MyStoredProcedureListPanel());

    setMasterPanelTitle("Affiliations list");
   // setSlavePanelTitle("Affiliation detail");
  }

 
  @Override
  public void addAction() {
	  logger.info("CheckPost1");
	  AddDialogManager.getInstance().showAddAffiliationDialog();
  }




 

 

}