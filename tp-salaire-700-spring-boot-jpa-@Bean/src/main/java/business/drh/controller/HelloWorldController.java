package business.drh.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import business.drh.dao.EmployeDao;
import business.drh.model.Employe;

@RestController
public class HelloWorldController {

	static final Logger logger =LoggerFactory.getLogger(HelloWorldController.class); 
	EmployeDao empDao ;
	
	@RequestMapping(value = "/greet/{id}" , method = RequestMethod.GET)
	//@RequestParam()
	public Employe helloGreeting(@PathVariable Long id) {
		
			 Optional<Employe> empOptional = empDao.findById(id);	
			 if(empOptional.isPresent()) {
				 return empOptional.get();
			 }
			 return null;
//		}catch(Exception ex) {
//			logger.error("erreur mon petit ouahid !");
//		}
		
	}
}
