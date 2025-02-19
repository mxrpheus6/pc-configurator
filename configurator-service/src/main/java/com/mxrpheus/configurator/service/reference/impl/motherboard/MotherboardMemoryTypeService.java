package com.mxrpheus.configurator.service.reference.impl.motherboard;

import com.mxrpheus.configurator.model.reference.motherboard.MotherboardMemoryTypeReference;
import com.mxrpheus.configurator.repository.reference.motherboard.MotherboardMemoryTypeRepository;
import com.mxrpheus.configurator.service.reference.impl.BaseReferenceServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MotherboardMemoryTypeService
        extends BaseReferenceServiceImpl<MotherboardMemoryTypeReference, MotherboardMemoryTypeRepository> {

    public MotherboardMemoryTypeService(MotherboardMemoryTypeRepository memoryTypeRepository) {
        super(memoryTypeRepository, MotherboardMemoryTypeReference.class);
    }

}
