package com.mxrpheus.configurator.controller.reference.motherboard;

import com.mxrpheus.configurator.controller.reference.BaseReferenceController;
import com.mxrpheus.configurator.model.reference.motherboard.MotherboardMemorySlotCountReference;
import com.mxrpheus.configurator.service.reference.impl.motherboard.MotherboardMemorySlotCountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/motherboard-memory-slots-count")
public class MotherboardMemorySlotCountController
        extends BaseReferenceController<MotherboardMemorySlotCountReference> {

    public MotherboardMemorySlotCountController(MotherboardMemorySlotCountService memorySlotCountService) {
        super(memorySlotCountService);
    }

}
