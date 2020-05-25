package org.upac.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.upac.dao.ContactRepository;
import org.upac.entities.Contact;

@RestController 
public class ContactRestService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	//@RequestMapping(value="/listContacts", method=RequestMethod.GET)
	@GetMapping(value="/listContacts") //,produces = MediaType.APPLICATION_JSON)
	public List<Contact> listContacts(){
		return contactRepository.findAll();
	}
	
	//@RequestMapping(value="/contacts/{id}", method=RequestMethod.GET)
	@GetMapping(value="/listContacts/{id}")
	public Contact listContact(@PathVariable(name = "id") Long id){
		return contactRepository.findById(id).get();
	}
	
//	@RequestMapping(value="/contacts", method=RequestMethod.POST)
	@PostMapping(value="/listContacts")
	public Contact save(@RequestBody Contact c){
		return contactRepository.save(c);
	}
	
//	@RequestMapping(value="/contacts/{id}", method=RequestMethod.DELETE)
	@DeleteMapping(value="/listContacts/{id}")
	public boolean delete(@PathVariable Long id){
		contactRepository.deleteById(id);
		return true;
	}
	
	//@RequestMapping(value="/contacts/{id}", method=RequestMethod.PUT)
	@PutMapping(value="/listContacts/{id}")
	public Contact update(@PathVariable Long id, @RequestBody Contact c){
		c.setId(id);
		return contactRepository.save(c);
	}
	
	//@RequestMapping(value="/contacts/{id}", method=RequestMethod.PATCH)
	@PatchMapping(value="/listContacts/{id}")
	public Contact updates(@PathVariable Long id, @RequestBody Contact c){
		c.setId(id);
		return contactRepository.save(c);
	}
	
}
