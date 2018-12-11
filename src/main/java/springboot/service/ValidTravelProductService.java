package springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import springboot.dal.dao.ValidTravelProduct;
import springboot.dal.persistence.ValidTravelProductRepository;
import springboot.service.model.TestModel;

import java.util.ArrayList;
import java.util.List;
@Service
public class ValidTravelProductService {

    @Autowired
    private ValidTravelProductRepository validTravelProductRepository;

    @Autowired
    private Converter<ValidTravelProduct,TestModel> testConverter;



    public  List<TestModel> findAll() {
        ArrayList<TestModel> items = new ArrayList<>();
//        for (ValidTravelProduct item :  validTravelProductRepository.findAll()) {
            for (ValidTravelProduct item :  validTravelProductRepository.getAllValidTravelProducts()) {

            items.add(testConverter.convert(item));
        }
        return   items;
    }


}
