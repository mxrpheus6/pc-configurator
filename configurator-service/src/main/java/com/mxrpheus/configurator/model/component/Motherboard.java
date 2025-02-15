package com.mxrpheus.configurator.model.component;

import com.mxrpheus.configurator.model.reference.motherboard.*;

import java.util.List;

public class Motherboard extends Component {
    private MotherboardFormFactor formFactor;
    private MotherboardSocket socket;
    private MotherboardChipset chipset;
    private MotherboardFeatures features;
    private MotherboardMemoryType memoryType;
    private MotherboardMemorySlotCount memorySlotsCount;
    private List<MotherboardSataController> sataControllers;
    private List<MotherboardExpansionSlot> expansionSlots;
    private MotherboardIntegratedGraphics integratedGraphics;
    private List<MotherboardNetworkInterface> networkInterfaces;
    private List<MotherboardBackPort> backPorts;
    private MotherboardPowerPhases powerPhases;
}