package com.mxrpheus.configurator.model.reference.motherboard;

import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "motherboard_form_factor_reference")
public class MotherboardFormFactorReference extends BaseReferenceEntity {
    public MotherboardFormFactorReference(String name) {
        super(name);
    }
}
