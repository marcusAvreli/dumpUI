package dumpUI.components.tableModel;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dumpUI.Controller.Controller;
import dumpUI.entity.Entity;
import dumpUI.entity.MyStoredProcedure;


public class MyStoredProcedureTableModel extends GenericDynamicTableModel<MyStoredProcedure> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(MyStoredProcedureTableModel.class);
  public MyStoredProcedureTableModel() {
    super(new String[] {"ID", "Full affiliation", "Documents", "Authors"});
   logger.info("MyStoredProcedureTableModel");
  }

 
  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
	  logger.info("getValueAt");
    if ((rowIndex >= 0) && (rowIndex < getRowCount())) {

    /*  Affiliation affiliation = getItem(rowIndex);

      switch (columnIndex) {

        case 0:
          return affiliation.getAffiliationID();

        case 1:
          return affiliation.getFullAffiliation();

        case 2:
          return affiliation.getDocumentsCount();

        case 3:
          return affiliation.getAuthorsCount();

        default:
          return "";
      }
*/
    } else {

      return "";

    }
    return "";
  }

 
}
