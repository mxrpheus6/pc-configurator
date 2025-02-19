package com.mxrpheus.configurator.controller.reference;

import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;
import com.mxrpheus.configurator.service.reference.BaseReferenceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public abstract class BaseReferenceController<T extends BaseReferenceEntity> {

    protected final BaseReferenceService<T> service;

    public BaseReferenceController(BaseReferenceService<T> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<T>> findByNameContaining(
            @RequestParam(required = false) String name) {

        List<T> result = service.findAllFiltered(name);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<T> save(
            @RequestBody T entity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
