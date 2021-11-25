package com.cts.jwa.service;

import java.util.ArrayList;
import java.util.List;

import com.cts.jwa.model.Contact;

public class ContactsService {
	
	private List<Contact> contacts;
	
	public ContactsService() {
		this.contacts=new ArrayList<Contact>();
		
		contacts.add(new Contact(1L, "Vamsy", "9052224753"));
		contacts.add(new Contact(2L, "Srinu", "1052224753"));
		contacts.add(new Contact(3L, "Komal", "7052224753"));
		contacts.add(new Contact(4L, "Vijju", "8052224753"));
	}

	public void add(Contact contact) {
		contacts.add(contact);
	}
	
	public void deleteById(Long cid) {
		Contact contact = contacts.stream().filter(c -> c.getId()==cid).findFirst().orElse(null);
		contacts.remove(contact);
	}
	
	public List<Contact> getAll(){
		return contacts;
	}
}
