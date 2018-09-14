package business.drh.service;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import business.drh.dao.EmployeDao;
import business.drh.dao.SalaireDao;
import business.drh.model.Employe;
import config.MyConfiguration;

/**
 * This test is an INTEGRATION test, since both the service PayrollServiceImpl
 * and its dependent Daos PaySlipDao and EmployeeDao are invoked through the use
 * of the PayrollService API.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfiguration.class)

public class ServiceDrhTest_3_Integration_Test_JUNIT_springtest {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ServiceDrh serviceDrh;

	@Autowired
	EmployeDao employeDao;

	@Autowired
	SalaireDao salaireDao;

	@org.junit.Test
	public void testHappyPath() {

		// ARRANGE
		Long ID_EMPLOYE = 55l;
		int MONTANT = 7000;
		Employe EMPLOYE = new Employe("toto", "dupond");
		EMPLOYE.setId(ID_EMPLOYE);

		// ACT
		serviceDrh.payerSalaire(ID_EMPLOYE, MONTANT);

		// ASSERT
		logger.debug("fini !");

	}
}
