package com.mxrpheus.configurator.service.motherboard.impl;

import com.mxrpheus.configurator.exception.EntityNotFoundException;
import com.mxrpheus.configurator.model.reference.motherboard.MotherboardMemoryTypeReference;
import com.mxrpheus.configurator.repository.reference.motherboard.MotherboardMemoryTypeRepository;
import com.mxrpheus.configurator.service.motherboard.MotherboardMemoryTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MotherboardMemoryTypeServiceImpl implements MotherboardMemoryTypeService {

    private final MotherboardMemoryTypeRepository memoryTypeRepository;

    @Override
    public List<MotherboardMemoryTypeReference> findAllFiltered(String name) {
        if (name == null) {
            return memoryTypeRepository.findAll();
        } else {
            return memoryTypeRepository.findByNameContainingIgnoreCase(name);
        }
    }

    @Override
    public MotherboardMemoryTypeReference findById(Long id) {
        return memoryTypeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MotherboardMemoryTypeReference.class, id));
    }
}
