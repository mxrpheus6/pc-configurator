package com.mxrpheus.configurator.service.reference.impl.motherboard;

import com.mxrpheus.configurator.model.reference.motherboard.MotherboardChipsetReference;
import com.mxrpheus.configurator.repository.reference.motherboard.MotherboardChipsetRepository;
import com.mxrpheus.configurator.service.reference.impl.BaseReferenceServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MotherboardChipsetService
        extends BaseReferenceServiceImpl<MotherboardChipsetReference, MotherboardChipsetRepository> {

    public MotherboardChipsetService(MotherboardChipsetRepository chipsetRepository) {
        super(chipsetRepository, MotherboardChipsetReference.class);
    }

}
