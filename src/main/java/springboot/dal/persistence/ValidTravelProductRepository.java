package springboot.dal.persistence;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springboot.dal.dao.ValidTravelProduct;

import java.util.Collection;

@Repository("ValidTravelProduct")
public interface ValidTravelProductRepository  extends CrudRepository<ValidTravelProduct, String> {
//    List<ValidTravelProduct> findByOperatorCd(String OperatorCd);

    String Q_GET_ALL_USERS = "select o.operatorCd,o.operatorDesc,v.prodCd from ValidTravelProduct v,Operator o where v.operator.operatorCd = o.operatorCd";
    @Query(Q_GET_ALL_USERS)
    Collection<ValidTravelProduct> getAllValidTravelProducts();
}
