package business.drh.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ServiceDrhImplBis implements ServiceDrh {

	private static Logger log = LoggerFactory.getLogger(ServiceDrhImplBis.class); 
	
	@Override
	public void payerSalaire(Long _idEmploye, int montant) {
		log.info("JE SUIS PASSE PAR LA CLASSE ServiceDrhBis");
		
	}

}
