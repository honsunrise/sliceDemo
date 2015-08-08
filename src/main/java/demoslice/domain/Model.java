package demoslice.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by iCoderc on 2015/8/8.
 */
@Document
public class Model {
    @Id
    private ObjectId id;
    @DBRef
    private List<OtherModel> otherModels;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<OtherModel> getOtherModels() {
        return otherModels;
    }

    public void setOtherModels(List<OtherModel> otherModels) {
        this.otherModels = otherModels;
    }
}
