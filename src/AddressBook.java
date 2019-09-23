import java.util.ArrayList;

public class AddressBook {
	
	ArrayList<BuddyInfo> buddies = new ArrayList<>();
	
	public void addBuddy(BuddyInfo buddyInfo) {
		if (buddyInfo != null) {
			buddies.add(buddyInfo);
		}
	}
	
	public BuddyInfo removeBuddy(int index) {
			return buddies.remove(index);
	}
	
	public boolean removeBuddy(BuddyInfo buddyInfo) {
		return buddies.remove(buddyInfo);
	}
	
	public BuddyInfo getBuddy(int index) {
		return buddies.get(index);
	}
	
	public ArrayList<BuddyInfo> getBuddies() {
		return new ArrayList<>(buddies);
	}
	
	
	@Override
    public String toString() {
        return buddies.toString();
    }
	
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o || getClass() != o.getClass()) return false;
        AddressBook addressBook = (AddressBook) o;
        return buddies == addressBook.getBuddies();
    }

	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}

}
