package demoslice.domain;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by iCoderc on 2015/8/8.
 */
@Document
public class OtherModel {
    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
