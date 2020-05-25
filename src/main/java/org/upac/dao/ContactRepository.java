package org.upac.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.upac.entities.Contact;

//@CrossOrigin("*")
@RepositoryRestResource
public interface ContactRepository extends JpaRepository<Contact, Long> {
	
	@RestResource(path = "/chercherContactsMC")
	public List<Contact> findByNomContains(@Param("mc")String nom);
	
	@RestResource(path = "/chercherContacts")
	public Page<Contact> findByNomContains(@Param("mc")String nom, Pageable pageable);
	
	//@Query("select c from Contact c where c.nom like :x")
	//public List<Contact> findByNomContains(@RequestParam(name="mc",defaultValue = "")String mc);
	
//	@RestResource(path = "/chercherContacts")
//	@Query("select c from Contact c where c.nom like :x")
//	public Page<Contact> chercher(@Param("x")String mc, Pageable pageable);
	
	//public Page<Contact> findByNomContains(String mc);
	
//	@Query("select c from Contact c where c.id like :x")
//	public Contact findOne(@Param("x") Long id);
	
//	@Query("DELETE c from Contact c where c.id like :x")
//	public void delete(@Param("x") Long id);

}
