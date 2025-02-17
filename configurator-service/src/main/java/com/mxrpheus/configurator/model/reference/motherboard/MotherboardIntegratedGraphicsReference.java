package com.mxrpheus.configurator.model.reference.motherboard;

import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "motherboard_integrated_graphics_reference")
public class MotherboardIntegratedGraphicsReference extends BaseReferenceEntity {
    public MotherboardIntegratedGraphicsReference(String name) {
        super(name);
    }
}
