package com.mxrpheus.configurator.service.reference.impl.motherboard;

import com.mxrpheus.configurator.model.reference.motherboard.MotherboardPowerPhasesReference;
import com.mxrpheus.configurator.repository.reference.motherboard.MotherboardPowerPhasesRepository;
import com.mxrpheus.configurator.service.reference.impl.BaseReferenceServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MotherboardPowerPhasesService
        extends BaseReferenceServiceImpl<MotherboardPowerPhasesReference, MotherboardPowerPhasesRepository> {

    public MotherboardPowerPhasesService(MotherboardPowerPhasesRepository powerPhasesRepository) {
        super(powerPhasesRepository, MotherboardPowerPhasesReference.class);
    }

}
