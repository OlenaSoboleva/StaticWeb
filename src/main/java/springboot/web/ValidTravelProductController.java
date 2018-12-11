package springboot.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.service.ValidTravelProductService;
import springboot.service.model.TestModel;

import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("/api/validTravelProduct")
public class ValidTravelProductController {
    @Autowired
    DataSource dataSource;
    @Autowired
    public ValidTravelProductService validTravelProductService;

    @RequestMapping
    public List<TestModel> getListOfVtp() {
        return  validTravelProductService.findAll();
    }

}
