package business.drh.service;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import business.drh.dao.EmployeDao;
import business.drh.dao.SalaireDao;
import business.drh.model.Employe;
import business.drh.model.Salaire;

public class ServiceDrhImpl implements ServiceDrh {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private EmployeDao employeDao;
	@Autowired
	private SalaireDao salaireDao;

	@PostConstruct
	public void init() {
		// de l'init
	}

	@Override
	public void payerSalaire(Long _idEmploye, int montant) {
		logger.info("IN idEmploye = " + _idEmploye + " montant = " + montant);
		Employe employe = employeDao.findById(_idEmploye);
		if (employe == null) {
			throw new RuntimeException("ça va pas la tete, l'id de l'employ� n'existe pas enb bd");
		}
		Salaire salaire = new Salaire(montant);
		salaire.setEmploye(employe);
		salaireDao.save(salaire);
		logger.info("OUT");
	}

	public void setEmployeDao(EmployeDao employeDao) {
		this.employeDao = employeDao;
	}

	public void setSalaireDao(SalaireDao salaireDao) {
		this.salaireDao = salaireDao;
	}

}
