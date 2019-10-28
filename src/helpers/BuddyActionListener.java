package helpers;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.AddressBook;

public abstract class BuddyActionListener  implements ActionListener {
	protected final JFrame frame;
	protected final JPanel panel;
	protected final AddressBook addressBook;
	protected final JTextField username;
	protected final JTextField homeAddress;
	protected final JTextField phoneNumber;

	public BuddyActionListener(JFrame frame, AddressBook addressBook) {
		username = new JTextField();
		homeAddress = new JTextField();
		phoneNumber = new JTextField();
		panel = new BuddyPanel(username, homeAddress, phoneNumber);
		this.frame = frame;
		this.addressBook = addressBook;
	}
}
