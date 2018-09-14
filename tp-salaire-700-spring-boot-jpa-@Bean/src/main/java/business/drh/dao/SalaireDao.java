package business.drh.dao;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import business.drh.model.Salaire;


@EnableJpaRepositories
public interface SalaireDao  extends CrudRepository<Salaire, Long>{

	//Salaire save(Salaire _salaire) ;

	//List<Salaire> findAll();

}
