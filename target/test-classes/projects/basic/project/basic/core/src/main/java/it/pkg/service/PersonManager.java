/**
 * 
 */
package it.pkg.service;

import it.pkg.model.Person;

import java.util.List;

/**
 * @author budi
 *
 */
public interface PersonManager extends GenericManager<Person, Long>{
	List<Person> findByLastName(String lastName);
}
