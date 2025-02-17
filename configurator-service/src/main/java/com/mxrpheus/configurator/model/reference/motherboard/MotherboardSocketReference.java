package com.mxrpheus.configurator.model.reference.motherboard;

import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "motherboard_socket_reference")
public class MotherboardSocketReference extends BaseReferenceEntity {
    public MotherboardSocketReference(String name) {
        super(name);
    }
}
