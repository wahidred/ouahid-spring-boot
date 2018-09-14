package business.drh.service;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import business.drh.dao.EmployeDao;
import business.drh.dao.SalaireDao;
import business.drh.model.Employe;
import config.MyConfiguration;

/**
 * This test is an INTEGRATION test, since both the service PayrollServiceImpl and its dependent
 * Daos PaySlipDao and EmployeeDao are invoked through the use of the PayrollService API.
 */
@ContextConfiguration(classes = MainHappyPath.class)
@TestExecutionListeners(DirtiesContextBeforeModesTestExecutionListener.class)
public class ServiceDrhTest_6_Unit_Test_TestNG_mockito_listener extends AbstractTestNGSpringContextTests {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@InjectMocks
	@Autowired
	ServiceDrh serviceDrh;

	@Mock
	EmployeDao employeDao;

	@Mock
	SalaireDao salaireDao;

	@BeforeClass
	void beforeClass() {
		MockitoAnnotations.initMocks(this);
	}

	@AfterMethod
	void afterClass() {
		Mockito.reset(employeDao, salaireDao);
	}

	@Test
	public void testHappyPath() {

		// ARRANGE
		Long ID_EMPLOYE = 55l;
		int MONTANT = 7000;
		String EMP_NAME = "dupond";
		Employe EMPLOYE = new Employe("toto", EMP_NAME);
		EMPLOYE.setId(ID_EMPLOYE);
		// THE mocks needs to be programmed, otherwise => exception
		Mockito.when(employeDao.findById(Mockito.anyLong())).thenReturn(EMPLOYE);
		// ACT
		serviceDrh.payerSalaire(ID_EMPLOYE, MONTANT);

		// ASSERT
		logger.debug("fini !");

	}
}
