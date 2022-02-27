package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	public void testContact() {
		Contact contact = new Contact("0000000001", "John", "Smith", "5555555555", "1 A St, Example, MA 00000");
		
		assertTrue(contact.getContactId().equals("0000000001"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Smith"));
		assertTrue(contact.getPhone().equals("5555555555"));
		assertTrue(contact.getAddress().equals("1 A St, Example, MA 00000"));
	}
	
	@Test
	public void testContactIdTooLong() {		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("00000000001", "John", "Smith", "5555555555", "1 A St, Example, MA 00000");
		});
	}
	
	@Test
	public void testFirstNameTooLong() {		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("0000000001", "Johnnnnnnnn", "Smith", "5555555555", "1 A St, Example, MA 00000");
		});
	}
	
	@Test
	public void testLastNameTooLong() {		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("0000000001", "John", "Smithhhhhhh", "5555555555", "1 A St, Example, MA 00000");
		});
	}
	
	@Test
	public void testPhoneTooLong() {		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("0000000001", "John", "Smith", "55555555555", "1 A St, Example, MA 00000");
		});
	}
	
	@Test
	public void testPhoneTooShort() {		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("0000000001", "John", "Smith", "555555555", "1 A St, Example, MA 00000");
		});
	}
	
	@Test
	public void testAddressTooLong() {		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("0000000001", "John", "Smith", "5555555555", "1 Example Street, Example, MA 00000");
		});
	}
	
	@Test
	public void testContactIdNull() {		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact(null, "John", "Smith", "5555555555", "1 A St, Example, MA 00000");
		});
	}
	
	@Test
	public void testFirstNameNull() {		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("0000000001", null, "Smith", "5555555555", "1 A St, Example, MA 00000");
		});
	}
	
	@Test
	public void testLastNameNull() {		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("0000000001", "John", null, "5555555555", "1 A St, Example, MA 00000");
		});
	}
	
	@Test
	public void testPhoneNull() {		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("0000000001", "John", "Smith", null, "1 A St, Example, MA 00000");
		});
	}
	
	@Test
	public void testAddressNull() {		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Contact("0000000001", "John", "Smith", "5555555555", null);
		});
	}
	

}
