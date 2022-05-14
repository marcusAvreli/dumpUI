package dumpUI.components.adddialog;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;




public class AddMyStoredProcedureDialog extends JDialog {


	private static final long serialVersionUID = 1L;
public AddMyStoredProcedureDialog(Frame parent) {
    super(parent, true);
    initComponents();
  }

 
  public void refresh() {

    this.fullAffiliationTextField.setText("");
  }


  @SuppressWarnings("unchecked")

  private void initComponents() {

    addButton = new JButton();
    cancelButton = new JButton();
    jSeparator1 = new JSeparator();
    fullAffiliationDescriptionLabel = new JLabel();
    fullAffiliationTextField = new JTextField();

    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Add document");
    setAlwaysOnTop(true);
    setModal(true);

    addButton.setText("Add");
    addButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
       // addButtonActionPerformed(evt);
      }
    });

    cancelButton.setText("Cancel");
    cancelButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        cancelButtonActionPerformed(evt);
      }
    });

    fullAffiliationDescriptionLabel.setText("Full affiliation:");

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
          .addComponent(jSeparator1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
          .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(addButton)
            .addPreferredGap(ComponentPlacement.RELATED)
            .addComponent(cancelButton))
          .addGroup(layout.createSequentialGroup()
            .addComponent(fullAffiliationDescriptionLabel)
            .addPreferredGap(ComponentPlacement.RELATED)
            .addComponent(fullAffiliationTextField, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
          .addComponent(fullAffiliationDescriptionLabel)
          .addComponent(fullAffiliationTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
          .addComponent(cancelButton)
          .addComponent(addButton))
        .addContainerGap())
    );

    pack();
  }

 
  private void cancelButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
    dispose();
  }
 /* private void addButtonActionPerformed(ActionEvent evt) {

    PerformKnowledgeBaseEditTask task;

    // If the name is empty
    if (this.fullAffiliationTextField.getText().isEmpty()) {

      JOptionPane.showMessageDialog(this, "You have to give a full affiliation.\nPlease, " +
        "give a full affiliation.", "Invalid full affiliation", JOptionPane.ERROR_MESSAGE);

    } else {

      task = new PerformKnowledgeBaseEditTask(new AddAffiliationEdit(this.fullAffiliationTextField.getText()), rootPane);

      task.execute();

      if (task.isSuccessful()) {

        dispose();
      }
    }
  }*/
  private JButton addButton;
  private JButton cancelButton;
  private JLabel fullAffiliationDescriptionLabel;
  private JTextField fullAffiliationTextField;
  private JSeparator jSeparator1;
 
}