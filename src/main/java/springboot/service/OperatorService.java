package springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.dal.dao.Operator;
import springboot.dal.persistence.OperatorRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class OperatorService {

    @Autowired
    OperatorRepository operatorRepository;

    public List<Operator> findAll() {
        List<Operator> items = new ArrayList<>();
        items.addAll((Collection<? extends Operator>) operatorRepository.findAll());
        return items;
    }
}
