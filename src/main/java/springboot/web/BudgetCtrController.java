package springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.dal.dao.BudgetCtr;
import springboot.service.BudgetCtrService;

import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("/api/branchBudgetCtr")
public class BudgetCtrController {

    @Autowired
    DataSource dataSource;
    @Autowired
    public BudgetCtrService budgetCtrService;

    @RequestMapping
    public List<BudgetCtr> getListOfBudgetCtr() {
        return budgetCtrService.findAll();
    }



}
