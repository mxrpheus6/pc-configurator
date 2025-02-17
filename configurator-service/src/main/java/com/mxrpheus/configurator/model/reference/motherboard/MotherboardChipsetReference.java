package com.mxrpheus.configurator.model.reference.motherboard;

import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "motherboard_chipset_reference")
public class MotherboardChipsetReference extends BaseReferenceEntity {
    public MotherboardChipsetReference(String name) {
        super(name);
    }
}
