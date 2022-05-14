package dumpUI.components.tableModel;


import java.util.ArrayList;
import java.util.Collections;


public abstract class GenericDynamicTableModel<E extends Comparable<E>> extends GenericTableModel<E> {


  public GenericDynamicTableModel(String[] columnNames) {
    super(columnNames);
  }

 
  public void addItems(ArrayList<E> items) {

    int i;
    int position;
    E item;

    for (i = 0; i < items.size(); i++) {

      item = items.get(i);
      
      position = Collections.binarySearch(this.data, item);

      if (position < 0) {

        position = -position - 1;

        this.data.add(position, item);

        fireTableRowsInserted(position, position);

        fireElementsCountChange();
      }

    }
  }


  public void removeItems(ArrayList<E> items) {

    int i;
    int position;
    E item;

    for (i = 0; i < items.size(); i++) {

      item = items.get(i);

      position = Collections.binarySearch(this.data, item);

      if (position >= 0) {

        this.data.remove(position);

        fireTableRowsDeleted(position, position);

        fireElementsCountChange();

      }

    }
  }

  public void updateItems(ArrayList<E> items) {

    int i;
    int position;
    E item;

    for (i = 0; i < items.size(); i++) {

      item = items.get(i);

      position = Collections.binarySearch(this.data, item);
      
      if (position >= 0) {

        this.data.set(position, item);
        fireTableRowsUpdated(position, position);
      }

    }
  }

  
}