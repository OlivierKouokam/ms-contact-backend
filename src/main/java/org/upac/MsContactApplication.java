package org.upac;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.upac.dao.ContactRepository;
import org.upac.entities.Contact;

@SpringBootApplication
public class MsContactApplication implements CommandLineRunner{
	@Autowired
	private ContactRepository contactRepository;
	
	//@Autowired
	//private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(MsContactApplication.class, args); 
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MICRO SERVICES CONTACT");
		
//		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//		contactRepository.save(new Contact(null, "KOUOKAM", "Olivier", df.parse("15/4/1992"), "olivier@gmail.com", (long) 55446677, "olivier.jpg"));
//		contactRepository.save(new Contact(null, "TCHASSEM", "Patrick", df.parse("15/4/1994"), "patrick@gmail.com", (long) 55446677, "olivier.jpg"));
//		contactRepository.save(new Contact(null, "TAMKO", "William", df.parse("15/4/1996"), "william@gmail.com", (long) 55446677, "olivier.jpg"));
		
//		contactRepository.findAll().forEach(c->{
//			System.out.println(c);
//		});
	}

}
