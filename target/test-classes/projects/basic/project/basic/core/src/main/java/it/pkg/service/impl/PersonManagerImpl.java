/**
 * 
 */
package it.pkg.service.impl;

import it.pkg.dao.PersonDao;
import it.pkg.model.Person;
import it.pkg.service.PersonManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author budi
 *
 */
@Service("personManager")
public class PersonManagerImpl extends GenericManagerImpl<Person, Long> implements PersonManager{
	
	PersonDao personDao;
	
	@Autowired
	public void setPersonDao(PersonDao personDao) {
		this.dao = personDao;
		this.personDao = personDao;
	}


	@Override
	public List<Person> findByLastName(String lastName) {
		return personDao.findByLastName(lastName);
	}

}
