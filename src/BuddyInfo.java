public class BuddyInfo {
	private String name;
	private String homeAddress;
	private String phoneNumber;

	public BuddyInfo (String name, String homeaddress, String phonenumer) {
		super();
		this.name = name;
		this.homeAddress = homeaddress;
		this.phoneNumber = phonenumer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeaddress(String homeaddress) {
		this.homeAddress = homeaddress;
	}

	public String getPhonenumer() {
		return phoneNumber;
	}

	public void setPhonenumer(String phonenumer) {
		this.phoneNumber = phonenumer;
	}


    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber + ", Home Address: " + homeAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o || getClass() != o.getClass()) return false;
        BuddyInfo buddyInfo = (BuddyInfo) o;
        return getName().equals(buddyInfo.getName())  && getHomeAddress().equals(buddyInfo.getHomeAddress()) && getPhonenumer().equals(buddyInfo.getPhonenumer());
    }
}