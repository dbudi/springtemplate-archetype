/**
 * 
 */
package it.pkg.webapp.controller;

import it.pkg.service.PersonManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author budi
 *
 */
@Controller
@RequestMapping("/persons*")
public class PersonController {
	@Autowired
	PersonManager personManager;
	
	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView handleRequest()
    throws Exception {
        return new ModelAndView().addObject(personManager.getAll());
    }
}
