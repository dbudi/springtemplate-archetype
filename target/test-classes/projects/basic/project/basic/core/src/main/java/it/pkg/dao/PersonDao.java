/**
 * 
 */
package it.pkg.dao;

import it.pkg.model.Person;

import java.util.List;

/**
 * @author budi
 *
 */
public interface PersonDao extends GenericDao<Person, Long>{
	public List<Person> findByLastName(String lastName);
}
