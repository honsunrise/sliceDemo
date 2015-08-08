package demoslice.repository;

import demoslice.domain.Model;
import demoslice.domain.OtherModel;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * Created by iCoderc on 2015/8/8.
 */
@NoRepositoryBean
public interface ModelRepository {
    void save(Model model);
    List<OtherModel> findOtherModelListFromModel(Model model, Pageable pageable);
}
