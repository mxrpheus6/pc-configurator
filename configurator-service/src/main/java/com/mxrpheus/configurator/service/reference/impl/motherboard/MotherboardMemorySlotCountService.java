package com.mxrpheus.configurator.service.reference.impl.motherboard;

import com.mxrpheus.configurator.model.reference.motherboard.MotherboardMemorySlotCountReference;
import com.mxrpheus.configurator.repository.reference.motherboard.MotherboardMemorySlotCountRepository;
import com.mxrpheus.configurator.service.reference.impl.BaseReferenceServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MotherboardMemorySlotCountService
        extends BaseReferenceServiceImpl<MotherboardMemorySlotCountReference, MotherboardMemorySlotCountRepository> {

    public MotherboardMemorySlotCountService(MotherboardMemorySlotCountRepository memorySlotCountRepository) {
        super(memorySlotCountRepository, MotherboardMemorySlotCountReference.class);
    }

}
