package com.mxrpheus.configurator.controller.reference.motherboard;

import com.mxrpheus.configurator.controller.reference.BaseReferenceController;
import com.mxrpheus.configurator.model.reference.motherboard.MotherboardPowerPhasesReference;
import com.mxrpheus.configurator.service.reference.impl.motherboard.MotherboardPowerPhasesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/motherboard-power-phases")
public class MotherboardPowerPhasesController
        extends BaseReferenceController<MotherboardPowerPhasesReference> {

    public MotherboardPowerPhasesController(MotherboardPowerPhasesService powerPhasesService) {
        super(powerPhasesService);
    }

}
