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
@Table(name = "motherboard_sata_controller_reference")
public class MotherboardSataControllerReference extends BaseReferenceEntity {
    public MotherboardSataControllerReference(String name) {
        super(name);
    }
}
