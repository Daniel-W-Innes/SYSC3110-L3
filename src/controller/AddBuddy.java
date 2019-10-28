package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import helpers.BuddyActionListener;
import helpers.BuddyInfo;
import helpers.BuddyPanel;
import model.AddressBook;

public class AddBuddy extends BuddyActionListener {

	public AddBuddy(JFrame frame, AddressBook addressBook) {
		super(frame, addressBook);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(frame, panel, "Add Buddy", JOptionPane.QUESTION_MESSAGE);
		if (!username.getText().equals("") && !homeAddress.getText().equals("") && !homeAddress.getText().equals(""))
			addressBook.addBuddy(new BuddyInfo(username.getText(), homeAddress.getText(), phoneNumber.getText()));
	}

}
