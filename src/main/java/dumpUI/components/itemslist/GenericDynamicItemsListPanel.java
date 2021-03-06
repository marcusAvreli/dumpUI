package dumpUI.components.itemslist;


import java.util.ArrayList;
import dumpUI.components.tableModel.GenericDynamicTableModel;

/**
 *
 * @author mjcobo
 */
public class GenericDynamicItemsListPanel<E extends Comparable<E>> extends GenericItemsListPanel<E> {

  /***************************************************************************/
  /*                        Private attributes                               */
  /***************************************************************************/
  
  /***************************************************************************/
  /*                            Constructors                                 */
  /***************************************************************************/
  
  public GenericDynamicItemsListPanel(GenericDynamicTableModel<E> tableModel) {
    super(tableModel);
  }
  
  /***************************************************************************/
  /*                           Public Methods                                */
  /***************************************************************************/
  
  /**
   * 
   * @param items 
   */
  public void addItems(ArrayList<E> items) {

    ((GenericDynamicTableModel<E>)getTableModel()).addItems(items);
  }

  /**
   * 
   * @param items 
   */
  public void removeItems(ArrayList<E> items) {

    ((GenericDynamicTableModel<E>)getTableModel()).removeItems(items);
  }
  
  /**
   * 
   * @param items 
   */
  public void updateItems(ArrayList<E> items) {

    ((GenericDynamicTableModel<E>)getTableModel()).updateItems(items);
  }
  
  /***************************************************************************/
  /*                           Private Methods                               */
  /***************************************************************************/
}