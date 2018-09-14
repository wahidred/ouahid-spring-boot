package business.drh.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.drh.model.Employe;
import config.MyConfiguration;

public class ServiceDrhTest_1_Integration_Test_JUNIT_no_tools2 {

	static Logger logger = LoggerFactory.getLogger(ServiceDrhTest_1_Integration_Test_JUNIT_no_tools2.class);
	static AnnotationConfigApplicationContext context;
	static ServiceDrh serviceDrh;

	@org.junit.BeforeClass
	public static void beforeClass() {
		logger.info("IN");
		context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		serviceDrh = context.getBean(ServiceDrh.class);
	}

	@AfterClass
	public static void afterClass() {
		logger.info("IN");
		context.close();
	}

	@Before
	public void beforeMethod() {
		logger.info("IN");
	}

	@After
	public void afterMethod() {
		logger.info("IN");
	}

	@Test
	public void testHappyPath() {
		logger.info("IN");

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

	@Test
	public void testHappyPath2() {
		logger.info("IN");

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
