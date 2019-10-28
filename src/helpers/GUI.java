package helpers;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import controller.AddBuddy;
import controller.RemoveBuddy;
import model.AddressBook;
import view.AddressBookDisplay;

public class GUI  extends JFrame {
	private static final long serialVersionUID = 1L;
	GUI(){ 
		AddressBook addressBook = new AddressBook();
		
		JMenuBar menuBar = new JMenuBar();
		JMenu editMenu = new JMenu("edit");
		editMenu.setMnemonic(KeyEvent.VK_E);
		menuBar.add(editMenu);
		
		JMenuItem addBuddy = new JMenuItem("Add new Buddy", KeyEvent.VK_A);
		addBuddy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		addBuddy.addActionListener(new AddBuddy(this, addressBook));
		editMenu.add(addBuddy);
		
		JMenuItem removeBuddy = new JMenuItem("Remove Buddy", KeyEvent.VK_R);
		removeBuddy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		removeBuddy.addActionListener(new RemoveBuddy(this, addressBook));
		editMenu.add(removeBuddy);
		
		setJMenuBar(menuBar);
		setContentPane(new AddressBookDisplay<>(addressBook));
		setSize(400,500);
		setVisible(true);  
	}  
	public static void main(String[] args) {  
		new GUI();
	}
}
