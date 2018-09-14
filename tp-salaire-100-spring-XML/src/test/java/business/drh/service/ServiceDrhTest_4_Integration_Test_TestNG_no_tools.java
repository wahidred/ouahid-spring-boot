package business.drh.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import business.drh.model.Employe;
import config.MyConfiguration;

public class ServiceDrhTest_4_Integration_Test_TestNG_no_tools {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	AnnotationConfigApplicationContext context;
	ServiceDrh serviceDrh;

	@BeforeClass
	public void beforeClass() {
		logger.info("IN");
		context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		serviceDrh = context.getBean(ServiceDrh.class);
	}

	@AfterClass
	public void afterClass() {
		logger.info("IN");
		context.close();
	}

	@BeforeMethod
	public void beforeMethod() {
		logger.info("IN");
	}

	@AfterMethod
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
