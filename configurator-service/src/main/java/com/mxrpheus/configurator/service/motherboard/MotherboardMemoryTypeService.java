package com.mxrpheus.configurator.service.motherboard;

import com.mxrpheus.configurator.model.reference.motherboard.MotherboardMemoryTypeReference;

import java.util.List;

public interface MotherboardMemoryTypeService {
    List<MotherboardMemoryTypeReference> findAllFiltered(String name);
    MotherboardMemoryTypeReference findById(Long id);

}
