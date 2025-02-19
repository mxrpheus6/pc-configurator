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
@Table(name = "motherboard_power_phases_reference")
public class MotherboardPowerPhasesReference extends BaseReferenceEntity {
    public MotherboardPowerPhasesReference(String phase) {
        super(phase);
    }
}
