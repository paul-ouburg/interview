package org.example.rest.dao;

import org.example.rest.model.MyModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MyDAO {
    private final List<MyModel> dataStore = new ArrayList<>();

    public void save(MyModel model) {
        dataStore.add(model);
    }

    public List<MyModel> findAll() {
        return new ArrayList<>(dataStore);
    }
}
