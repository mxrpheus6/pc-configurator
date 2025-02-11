package com.mxrpheus.configurator.model;

import com.mxrpheus.configurator.model.enums.ComponentType;

import java.math.BigDecimal;

public abstract class Component {
    private Long id;
    private String article_number;
    private String brand;
    private String brandWebsite;
    private String name;
    private BigDecimal price;
    private ComponentType type;
}
