package dumpUI;


import javax.swing.JComponent;
import javax.swing.JPanel;


public class ShowManagerTask {

 
  private JComponent receiver;

 
  private JPanel panel;

 
  public ShowManagerTask(JComponent receiver, JPanel panel) {
    this.receiver = receiver;
    this.panel = panel;
  }

 
  public void execute() {

    this.receiver.removeAll();
    this.receiver.add(this.panel);
    this.receiver.validate();
    this.receiver.repaint();
  }

  /***************************************************************************/
  /*                           Private Methods                               */
  /***************************************************************************/
}
