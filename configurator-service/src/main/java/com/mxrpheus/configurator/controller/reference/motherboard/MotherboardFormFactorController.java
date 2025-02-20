package com.mxrpheus.configurator.controller.reference.motherboard;

import com.mxrpheus.configurator.controller.reference.BaseReferenceController;
import com.mxrpheus.configurator.model.reference.motherboard.MotherboardFormFactorReference;
import com.mxrpheus.configurator.service.reference.impl.motherboard.MotherboardFormFactorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/motherboard-form-factors")
public class MotherboardFormFactorController
        extends BaseReferenceController<MotherboardFormFactorReference> {
    public MotherboardFormFactorController(MotherboardFormFactorService formFactorService) {
        super(formFactorService);
    }
}
