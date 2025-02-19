package com.mxrpheus.configurator.model.reference.motherboard;

import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "motherboard_integrated_graphics_reference")
public class MotherboardIntegratedGraphicsReference extends BaseReferenceEntity {
    public MotherboardIntegratedGraphicsReference(String name) {
        super(name);
    }
}
