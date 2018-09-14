package config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bpp.DebugBpp;
import business.drh.dao.EmployeDaoImpl;
import business.drh.dao.SalaireDaoImpl;
import business.drh.service.ServiceDrh;
import business.drh.service.ServiceDrhImpl;
import business.drh.service.ServiceDrhImplBis;
//import business.drh.service.ServiceDrhImplBis;

@Configuration
public class MyConfiguration {

		
	
    
	@Bean
	@ConditionalOnBean
	public ServiceDrhImplBis serviceDrhBis(){
		return new ServiceDrhImplBis();
	}
	
	@Bean
	@ConditionalOnMissingBean(ServiceDrh.class)
	public ServiceDrhImpl serviceDrh(){
		return new ServiceDrhImpl();
	}
	
	@Bean
	public EmployeDaoImpl employeDao() {
		return new EmployeDaoImpl();
	}
	
	@Bean
	public SalaireDaoImpl salaireDao() {
		return new SalaireDaoImpl();
	}
	
	@Bean
	public DebugBpp debugBpp() {
		return new DebugBpp();
	}
	
   
}
