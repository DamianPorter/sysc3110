import java.util.*;
public class AddressBook {
	
	private List<BuddyInfo> book;
	
	public AddressBook(){
		
		book = new ArrayList<BuddyInfo>();
		
	}

	public void addBuddy(BuddyInfo b){
		
		book.add(b);
		
	}
	
	public void removeBuddy(BuddyInfo b){
		
		book.remove(b);
		
	}
	
	public static void main(String args[]){
		
		System.out.println("Address Book");	
		AddressBook book = new AddressBook();
		BuddyInfo b = new BuddyInfo("Scott", "Toronto", 4);
		
		book.addBuddy(b);
		book.removeBuddy(b);
		
	}
	
}
