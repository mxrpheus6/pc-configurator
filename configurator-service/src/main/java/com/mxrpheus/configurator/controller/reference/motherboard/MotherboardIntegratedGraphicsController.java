package com.mxrpheus.configurator.controller.reference.motherboard;

import com.mxrpheus.configurator.controller.reference.BaseReferenceController;
import com.mxrpheus.configurator.model.reference.motherboard.MotherboardIntegratedGraphicsReference;
import com.mxrpheus.configurator.service.reference.impl.motherboard.MotherboardIntegratedGraphicsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/motherboard-integrated-graphics")
public class MotherboardIntegratedGraphicsController
        extends BaseReferenceController<MotherboardIntegratedGraphicsReference> {

    public MotherboardIntegratedGraphicsController(MotherboardIntegratedGraphicsService integratedGraphicsService) {
        super(integratedGraphicsService);
    }

}
