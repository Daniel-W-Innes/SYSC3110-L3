package view;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

public class AddressBookDisplay <T> extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public AddressBookDisplay(ListModel<T> addressBook ) {
		JList<T> list = new JList<T>(addressBook);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollPane = new JScrollPane(list);
		add(scrollPane);
	}
}
