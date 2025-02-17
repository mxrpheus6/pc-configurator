package com.mxrpheus.configurator.model.component;

import com.mxrpheus.configurator.model.reference.gpu.GpuCoolingSystem;
import com.mxrpheus.configurator.model.reference.gpu.GpuDeliveryType;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Gpu extends Component {
    private String busInterface;
    private String gpuManufacturer;
    private String series;
    private Integer slotSize;
    private GpuCoolingSystem coolingSystem;
    private Integer coolersCount;
    private List<String> ports;
    private Integer nodeNm;
    private Integer coreClockSpeedMHz;
    private Integer memoryClockSpeedMHz;
    private Integer memoryGB;
    private String memoryType;
    private Integer memoryBusWidth;
    private String powerConnector;
    private GpuDeliveryType deliveryType;
    private Integer width;
    private Integer height;
    private Integer depth;
}