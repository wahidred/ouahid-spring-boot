package business.drh.service;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "config")
public class MainHappyPath {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = 	SpringApplication.run(MainHappyPath.class, args);
		
		// ServiceDrh serviceDrh = (ServiceDrh) context.getBean("serviceDrh");
		ServiceDrh serviceDrh = context.getBean(ServiceDrh.class);

		Map<String, ServiceDrh> list = context.getBeansOfType(ServiceDrh.class);

		serviceDrh.payerSalaire(55L, 7000);

		context.close();
	}
}
