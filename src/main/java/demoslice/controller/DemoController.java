package demoslice.controller;

import demoslice.domain.Model;
import demoslice.domain.OtherModel;
import demoslice.repository.ModelRepository;
import demoslice.repository.OtherModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iCoderc on 2015/8/8.
 */
@RestController
public class DemoController {

    @Autowired
    private ModelRepository modelRepository;
    @Autowired
    private OtherModelRepository otherModelRepository;

    @RequestMapping("/otherModelList")
    public Object getOtherModelList(Pageable pageable) {

        /**
         * Create a random OtherModel list
         */
        List<OtherModel> otherModels = new ArrayList<>(10);
        for (OtherModel otherModel : otherModels) {
            otherModel.setField(String.valueOf(Math.random()));
        }

        /**
         * Save the list to database
         */
        List<OtherModel> savedOtherModels = otherModelRepository.save(otherModels);

        /**
         * Create a Model object
         */
        Model model = new Model();
        model.setOtherModels(savedOtherModels);

        /**
         * Save the list to database
         */
        modelRepository.save(model);
        return modelRepository.findOtherModelListFromModel(model, pageable);
    }
}
