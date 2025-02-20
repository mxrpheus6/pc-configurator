package com.mxrpheus.configurator.service.reference.impl.motherboard;

import com.mxrpheus.configurator.model.reference.motherboard.MotherboardSocketReference;
import com.mxrpheus.configurator.repository.reference.motherboard.MotherboardSocketRepository;
import com.mxrpheus.configurator.service.reference.impl.BaseReferenceServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MotherboardSocketService
        extends BaseReferenceServiceImpl<MotherboardSocketReference, MotherboardSocketRepository> {

    public MotherboardSocketService(MotherboardSocketRepository socketRepository) {
        super(socketRepository, MotherboardSocketReference.class);
    }

}
