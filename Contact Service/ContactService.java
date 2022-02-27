package contact;
import java.util.ArrayList;

public class ContactService {

	private ArrayList<Contact>contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	public boolean addContact(Contact contact) {
		boolean contactAlready = false;
		for (Contact contactList:contacts) {
			if(contactList.equals(contact)) {
				contactAlready = true;
			}
		}
		if (!(contactAlready)) {
			contacts.add(contact);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean deleteContact(String contactId) {
		for (Contact contactList:contacts) {
			if(contactList.getContactId().equals(contactId)) {
				contacts.remove(contactList);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateContact(String contactId, String firstName, String lastName, String phone, String address) {
		for ( Contact contactList:contacts) {
			if (contactList.getContactId().equals(contactId)) {
				contactList.setFirstName(firstName);
				contactList.setLastName(lastName);
				contactList.setPhone(phone);
				contactList.setAddress(address);
				return true;
			}
		}
		return false;
	}
	
}
