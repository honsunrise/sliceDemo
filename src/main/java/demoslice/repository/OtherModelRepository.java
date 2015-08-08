package demoslice.repository;

import demoslice.domain.OtherModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by iCoderc on 2015/8/8.
 */
public interface OtherModelRepository extends MongoRepository<OtherModel, ObjectId> {
}
