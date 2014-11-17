/**
 * 
 */
package it.pkg.ejb.session;

import javax.ejb.Local;

/**
 * @author budi
 *
 */
@Local
public interface FileProcessing {
	public int callProcedureReadCsv(String csvFileName); 
}
