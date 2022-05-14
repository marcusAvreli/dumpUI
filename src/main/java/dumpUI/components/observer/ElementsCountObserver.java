package dumpUI.components.observer;

import java.util.List;

import dumpUI.entity.MyStoredProcedure;

/*
 * ElementsCountObserver.java
 *
 * Created on 12-mar-2011, 21:21:30
 */


/**
 *
 * @author mjcobo
 */
public interface ElementsCountObserver {

  /**
   * 
   * @param newElementsCount
   */
  public void elementsCountChanged(int newElementsCount);



}