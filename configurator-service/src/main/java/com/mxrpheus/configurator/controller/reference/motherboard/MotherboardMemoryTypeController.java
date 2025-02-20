package com.mxrpheus.configurator.controller.reference.motherboard;

import com.mxrpheus.configurator.controller.reference.BaseReferenceController;
import com.mxrpheus.configurator.model.reference.motherboard.MotherboardMemoryTypeReference;
import com.mxrpheus.configurator.service.reference.impl.motherboard.MotherboardMemoryTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/motherboard-memory-types")
public class MotherboardMemoryTypeController
        extends BaseReferenceController<MotherboardMemoryTypeReference> {
    public MotherboardMemoryTypeController(MotherboardMemoryTypeService service) {
        super(service);
    }
}
