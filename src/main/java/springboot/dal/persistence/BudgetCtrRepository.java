package springboot.dal.persistence;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springboot.dal.dao.BudgetCtr;

import java.util.List;

@Repository("BudgetCtr")
public interface BudgetCtrRepository extends CrudRepository<BudgetCtr, Integer> {

    List<BudgetCtr> findByBranchBudgetCtr (Integer branchBudgetCtr );

//    @Query("select c.branch_budget_ctr ,\n" +
//            "c.budget_ctr_name ,\n" +
//            "c.budget_type ,\n" +
//            "c.inactive_date ,\n" +
//            "c.inactive_ind ,\n" +
//            "c.ticket_mode from budget_ctr c where c.branch_budget_ctr = :branch_budget_ctr")
//    Stream<BudgetCtr> findByBranch_budget_ctr(@Param("branch_budget_ctr") String branch_budget_ctr);
    // custom query example and return a stream
//    @Query("select c.BUDGET_CTR_NAME from BUDGET_CTR c where c.BRANCH_BUDGET_CTR = :BRANCH_BUDGET_CTR")
//    Stream<BudgetCtr> findByEmailReturnStream(@Param("email") String email);
}