package springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.dal.dao.BudgetCtr;
import springboot.dal.persistence.BudgetCtrRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class BudgetCtrService {



    @Autowired
    BudgetCtrRepository budgetctrRepository;

    public List<BudgetCtr> findAll() {
        List<BudgetCtr> items = new ArrayList<>();
        items.addAll((Collection<? extends BudgetCtr>) budgetctrRepository.findAll());
        return items;
    }
}
