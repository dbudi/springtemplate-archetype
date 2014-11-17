#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.webapp.controller;

import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author budi
 *
 */
public class PersonControllerTest extends BaseControllerTestCase{
	@Autowired
	private PersonController controller;

	@Test
	public void testHandleRequest() throws Exception {
		ModelAndView mav = controller.handleRequest();
		ModelMap m = mav.getModelMap();
		assertNotNull(m.get("personList"));
		assertTrue(((List) m.get("personList")).size() > 0);
	}
}
