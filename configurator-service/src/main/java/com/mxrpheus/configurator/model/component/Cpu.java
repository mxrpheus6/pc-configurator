package com.mxrpheus.configurator.model.component;

import com.mxrpheus.configurator.model.reference.CpuDeliveryType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Cpu extends Component {
    private String series;
    private String model;
    private String codename;
    private String socket;
    private String coreName;
    private Integer coreCount;
    private Integer threadsCount;
    private Integer wattage;
    private Integer clockSpeedMHz;
    private String turboClockSpeedMHz;
    private boolean hasIntegratedGraphics;
    private Integer nodeNm;
    private Integer maxTemperature;
    private CpuDeliveryType deliveryType;
}