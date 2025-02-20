package com.mxrpheus.configurator.controller.reference.motherboard;

import com.mxrpheus.configurator.controller.reference.BaseReferenceController;
import com.mxrpheus.configurator.model.reference.motherboard.MotherboardChipsetReference;
import com.mxrpheus.configurator.service.reference.impl.motherboard.MotherboardChipsetService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/motherboard-chipsets")
public class MotherboardChipsetController
        extends BaseReferenceController<MotherboardChipsetReference> {

    public MotherboardChipsetController(MotherboardChipsetService chipsetService) {
        super(chipsetService);
    }

}
