package com.mxrpheus.configurator.model.reference;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseReferenceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
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
