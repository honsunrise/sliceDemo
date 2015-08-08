package demoslice.domain;

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
    private String id;
    @DBRef
    private List<OtherModel> otherModels;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<OtherModel> getOtherModels() {
        return otherModels;
    }

    public void setOtherModels(List<OtherModel> otherModels) {
        this.otherModels = otherModels;
    }
}
