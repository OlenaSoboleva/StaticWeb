package springboot.dal.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springboot.dal.dao.Operator;

@Repository("Operator")
public interface OperatorRepository extends CrudRepository<Operator, String> {
}
