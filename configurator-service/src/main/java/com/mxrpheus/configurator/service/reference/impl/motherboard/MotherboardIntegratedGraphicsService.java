package com.mxrpheus.configurator.service.reference.impl.motherboard;

import com.mxrpheus.configurator.model.reference.motherboard.MotherboardIntegratedGraphicsReference;
import com.mxrpheus.configurator.repository.reference.motherboard.MotherboardIntegratedGraphicsRepository;
import com.mxrpheus.configurator.service.reference.impl.BaseReferenceServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MotherboardIntegratedGraphicsService
        extends BaseReferenceServiceImpl<MotherboardIntegratedGraphicsReference, MotherboardIntegratedGraphicsRepository> {

    public MotherboardIntegratedGraphicsService(MotherboardIntegratedGraphicsRepository integratedGraphicsRepository) {
        super(integratedGraphicsRepository, MotherboardIntegratedGraphicsReference.class);
    }

}
