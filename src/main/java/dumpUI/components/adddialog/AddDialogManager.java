package dumpUI.components.adddialog;

import javax.swing.JFrame;

public class AddDialogManager {

	private AddMyStoredProcedureDialog addMyStoredPorcedureDialog;

	private AddDialogManager() {

	}

	public static AddDialogManager getInstance() {

		return AddDialogManagerHolder.INSTANCE;
	}

	private static class AddDialogManagerHolder {

		private static final AddDialogManager INSTANCE = new AddDialogManager();
	}

	public void init(JFrame frame) {

		this.addMyStoredPorcedureDialog = new AddMyStoredProcedureDialog(frame);

	}

	public void showAddAffiliationDialog() {

		this.addMyStoredPorcedureDialog.refresh();
		this.addMyStoredPorcedureDialog.setVisible(true);
	}

}
