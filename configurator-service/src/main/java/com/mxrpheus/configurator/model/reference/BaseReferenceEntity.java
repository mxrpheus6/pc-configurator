package com.mxrpheus.configurator.model.reference;

public abstract class BaseReferenceEntity {
    private Long id;
    private String name;
    private Integer count;

    public BaseReferenceEntity() {}

    public BaseReferenceEntity(String name) {
        this.name = name;
        this.count = 0;
    }

    public BaseReferenceEntity(String name, Integer count) {
        this.name = name;
        this.count = count;
    }
}
