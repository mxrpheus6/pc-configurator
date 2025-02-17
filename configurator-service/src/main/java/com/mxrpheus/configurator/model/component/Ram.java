package com.mxrpheus.configurator.model.component;

import com.mxrpheus.configurator.model.reference.ram.RamCoolingSystem;
import com.mxrpheus.configurator.model.reference.ram.RamFeature;

import java.util.List;

public class Ram extends Component {
    private String memoryType;
    private String memoryTechnology;
    private Integer memorySpeedMHz;
    private Integer memorySizeGB;
    private Integer modulesAmount;
    private Integer throughputMB;
    private Integer CL;
    private RamCoolingSystem coolingSystem;
    private List<RamFeature> features;
}