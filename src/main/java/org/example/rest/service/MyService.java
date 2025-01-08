package org.example.rest.service;

import org.example.rest.dao.MyDAO;
import org.example.rest.model.MyModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    private final MyDAO myDAO;

    public MyService(MyDAO myDAO) {
        this.myDAO = myDAO;
    }

    public void saveModel(MyModel model) {
        myDAO.save(model);
    }

    public List<MyModel> getAllModels() {
        return myDAO.findAll();
    }
}
