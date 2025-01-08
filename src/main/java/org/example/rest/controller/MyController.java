package org.example.rest.controller;

import org.example.rest.model.MyModel;
import org.example.rest.service.MyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
public class MyController {
    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @PostMapping
    public ResponseEntity<String> saveModel(@RequestBody MyModel model) {
        myService.saveModel(model);
        return ResponseEntity.ok("Model saved successfully");
    }

    @GetMapping
    public ResponseEntity<List<MyModel>> getAllModels() {
        List<MyModel> models = myService.getAllModels();
        return ResponseEntity.ok(models);
    }
}
