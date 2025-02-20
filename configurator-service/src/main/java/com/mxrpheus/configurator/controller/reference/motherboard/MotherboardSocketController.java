package com.mxrpheus.configurator.controller.reference.motherboard;

import com.mxrpheus.configurator.controller.reference.BaseReferenceController;
import com.mxrpheus.configurator.model.reference.motherboard.MotherboardSocketReference;
import com.mxrpheus.configurator.service.reference.impl.motherboard.MotherboardSocketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/motherboard-sockets")
public class MotherboardSocketController extends BaseReferenceController<MotherboardSocketReference> {

    public MotherboardSocketController(MotherboardSocketService socketService) {
        super(socketService);
    }

}
