package com.mxrpheus.configurator.model.reference.motherboard;

import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "motherboard_memory_type_reference")
public class MotherboardMemoryTypeReference extends BaseReferenceEntity {
    public MotherboardMemoryTypeReference(String name) {
        super(name);
    }
}
