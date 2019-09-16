import java.util.ArrayList;

public class AddressBook {
	
	ArrayList<BuddyInfo> buddies = new ArrayList<>();
	
	public void addBuddy(BuddyInfo buddyInfo) {
		if (buddyInfo != null) {
			buddies.add(buddyInfo);
		}
	}
	
	public void removeBuddy(int index) {
		if (index >= 0  && index < buddies.size()) {
			buddies.get(index);
		}
	}
	

	public static void main(String[] args) {
		System.out.println("Address Book");

	}

}
