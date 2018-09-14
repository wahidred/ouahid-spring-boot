package business.drh.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import business.drh.model.Employe;

public class EmployeDaoImpl implements EmployeDao {

	private Logger logger = LoggerFactory.getLogger(getClass());

	public Employe findById(Long _id) {
		logger.info("IN with id = " + _id);
		Employe employe = new Employe("Nogal", "Gerard");
		employe.setId(_id);
		logger.info("OUT with Employe = " + employe);
		return employe;
	}

}
