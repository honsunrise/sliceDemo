package demoslice.repository.impl;

import demoslice.domain.Model;
import demoslice.domain.OtherModel;
import demoslice.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by iCoderc on 2015/8/8.
 */
@Repository
public class ModelRepositoryImpl implements ModelRepository{
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(Model model) {
        mongoTemplate.save(model);
    }

    @Override
    public List<OtherModel> findOtherModelListFromModel(Model model, Pageable pageable) {
        Query query = new Query(Criteria.where("_id").is(model.getId()));
        query.fields().slice("otherModels", pageable.getOffset(), pageable.getPageSize());
        Model m = mongoTemplate.findOne(query, Model.class);
        Assert.notNull(m);
        return m.getOtherModels();
    }
}
