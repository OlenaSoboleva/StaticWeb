package springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.dal.dao.Operator;
import springboot.service.OperatorService;

import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("/api/operator")
public class OperatorController {

    @Autowired
    DataSource dataSource;
    @Autowired
    public OperatorService operatorService;

    @RequestMapping
    public List<Operator> getListOfOperators() {
        return operatorService.findAll();
    }



}
