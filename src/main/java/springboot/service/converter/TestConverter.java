package springboot.service.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import springboot.dal.dao.ValidTravelProduct;
import springboot.service.model.TestModel;

@Component
public class TestConverter implements Converter<ValidTravelProduct, TestModel> {
    @Override
    public TestModel convert(ValidTravelProduct validTravelProduct) {
        TestModel testModel = new TestModel();
        testModel.setOperatorCd(validTravelProduct.getOperator().getOperatorCd());
        testModel.setOperatorDesc(validTravelProduct.getOperator().getOperatorDesc());
        testModel.setProdCd(validTravelProduct.getId().getProdCd());
        return testModel;
    }
}
