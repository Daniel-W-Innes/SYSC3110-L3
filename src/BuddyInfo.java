public class BuddyInfo {
	private String name;
	private String homeaddress;
	private String phonenumer;

	public BuddyInfo (String name, String homeaddress, String phonenumer) {
		super();
		this.name = name;
		this.homeaddress = homeaddress;
		this.phonenumer = phonenumer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}

	public String getPhonenumer() {
		return phonenumer;
	}

	public void setPhonenumer(String phonenumer) {
		this.phonenumer = phonenumer;
	}
}