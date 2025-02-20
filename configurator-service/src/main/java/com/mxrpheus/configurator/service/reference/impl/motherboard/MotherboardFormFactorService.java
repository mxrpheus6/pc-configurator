package com.mxrpheus.configurator.service.reference.impl.motherboard;

import com.mxrpheus.configurator.model.reference.motherboard.MotherboardFormFactorReference;
import com.mxrpheus.configurator.repository.reference.motherboard.MotherboardFormFactorRepository;
import com.mxrpheus.configurator.service.reference.impl.BaseReferenceServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MotherboardFormFactorService
        extends BaseReferenceServiceImpl<MotherboardFormFactorReference, MotherboardFormFactorRepository> {

    public MotherboardFormFactorService(MotherboardFormFactorRepository formFactorRepository) {
        super(formFactorRepository, MotherboardFormFactorReference.class);
    }

}
