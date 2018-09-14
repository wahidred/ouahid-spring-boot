package business.drh.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import business.drh.controller._controller;
import business.drh.dao.LoadDao;
import business.drh.dao._Dao;
import business.drh.model.Employe;
import twork.DebugBpp;

@SpringBootApplication
//@EnableTransactionManagement
//@PropertySource("classpath:/sgbd.properties") // propertySource still WORKS with Boot
@ComponentScan(basePackageClasses = {_Service.class, _Dao.class, _controller.class})
@EnableJpaRepositories(basePackageClasses = {_Service.class, _Dao.class})
@EntityScan(basePackageClasses=Employe.class)

public class Main {


	    private Logger logger = LoggerFactory.getLogger(this.getClass());
	    
	    
	public static void main(String[] args) throws Exception {

		ConfigurableApplicationContext context = SpringApplication.run(Main.class);

		LoadDao loadDao = context.getBean(LoadDao.class);
		loadDao.load();

		ServiceDrh serviceDrh = context.getBean(ServiceDrh.class);
		serviceDrh.payerSalaire(10L, 2000);

		System.out.println("fini");

		//context.close();
	}
	
	@Bean
    DebugBpp debugBpp() {
        return new DebugBpp();
    }
}
