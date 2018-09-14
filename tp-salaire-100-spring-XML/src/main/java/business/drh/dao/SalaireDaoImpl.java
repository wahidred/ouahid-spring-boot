package business.drh.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import business.drh.model.Salaire;

public class SalaireDaoImpl implements SalaireDao {
	private Logger logger = LoggerFactory.getLogger(getClass());

	public Salaire save(Salaire _salaire) {
		logger.info("IN with _salaire = " + _salaire);
		logger.info("for Employe = " + _salaire.getEmploye());

		_salaire.setId(777L);
		logger.info("OUT with _salaire = " + _salaire);
		logger.info("for Employe = " + _salaire.getEmploye());
		return _salaire;
	}

}
