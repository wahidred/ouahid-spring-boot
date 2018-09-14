package business.drh.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import business.drh.model.Employe;


@Repository
public interface EmployeDao extends CrudRepository<Employe, Long> {

	//Employe findById(Long _id);

	//Employe save(Employe _employe);
	@Query("SELECT emp FROM Employe emp WHERE prenom =:myParam")
	List<Employe> findByPrenom(@Param("myParam") String  toto);
	
	

}
