
public class AddressBook {
	
	private List<BuddyInfo> book;
	
	public AddressBook(){
		
		book = new ArrayList<BuddyInfo>();
		
	}

	public void addBuddy(buddyInfo b){
		
		book.append(b);
		
	}
	
	public void removeBuddy(buddyInfo b){
		
		book.remove(b);
		
	}
	
	public static void main(String args[]){
		
		System.out.println("Address Book");	
		AddressBook book = new AddressBook();
		BuddyInfo b = new BuddyInfo("Scott", "Toronto", "Phone?");
		
		book.addBuddy(b);
		book.removeBuddy(b);
		
	}
	
}
