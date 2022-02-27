package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	public void testAddContact() {
		ContactService cs = new ContactService();
		Contact test1 = new Contact("0000000001", "John", "Smith", "5555555555", "1 A St, Example, MA 00000");
		assertEquals(true,cs.addContact(test1));
	}
	
	@Test
	public void testDeleteContact() {
		ContactService cs = new ContactService();
		Contact test1 = new Contact("0000000001", "John", "Smith", "5555555555", "1 A St, Example, MA 00000");
		Contact test2 = new Contact("0000000002", "Jane", "Jones", "1111111111", "2 B St, Example, RI 11111");
		Contact test3 = new Contact("0000000003", "Adam", "Barns", "6666666666", "3 C St, Example, NH 22222");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true, cs.deleteContact("0000000002"));
		assertEquals(false, cs.deleteContact("0000000012"));
		assertEquals(false, cs.deleteContact("0000000002"));
	}
	
	@Test
	public void testUpdateContact() {
		ContactService cs = new ContactService();
		
		Contact test1 = new Contact("0000000001", "John", "Smith", "5555555555", "1 A St, Example, MA 00000");
		Contact test2 = new Contact("0000000002", "Jane", "Jones", "1111111111", "2 B St, Example, RI 11111");
		Contact test3 = new Contact("0000000003", "Adam", "Barns", "6666666666", "3 C St, Example, NH 22222");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true,cs.updateContact("0000000001", "Joe", "Park", "4444444444", "4 D St, Test, CA 33333"));
		assertEquals(false,cs.updateContact("0000000012", "Joe", "Park", "4444444444", "4 D St, Test, CA 33333"));
	}

}
