package com.mxrpheus.configurator.controller.reference.motherboard;

import com.mxrpheus.configurator.model.reference.motherboard.MotherboardMemoryTypeReference;
import com.mxrpheus.configurator.service.reference.impl.motherboard.MotherboardMemoryTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/motherboard-memory-types")
@RequiredArgsConstructor
public class MotherboardMemoryTypeController {

    private final MotherboardMemoryTypeService memoryTypeService;

    @GetMapping
    public ResponseEntity<List<MotherboardMemoryTypeReference>> findByNameContaining(
            @RequestParam(required = false) String name) {

        List<MotherboardMemoryTypeReference> result = memoryTypeService.findAllFiltered(name);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MotherboardMemoryTypeReference> findById(@PathVariable Long id) {
        return ResponseEntity.ok(memoryTypeService.findById(id));
    }

    @PostMapping
    public ResponseEntity<MotherboardMemoryTypeReference> save(
            @RequestBody MotherboardMemoryTypeReference memoryTypeReference) {
        return ResponseEntity.status(HttpStatus.CREATED).body(memoryTypeService.save(memoryTypeReference));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        memoryTypeService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
