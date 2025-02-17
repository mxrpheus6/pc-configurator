package com.mxrpheus.configurator.model.reference.motherboard;

import com.mxrpheus.configurator.model.component.Motherboard;
import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "motherboard_back_port_reference")
public class MotherboardBackPortReference extends BaseReferenceEntity {

    @ManyToMany(mappedBy = "backPorts")
    private List<Motherboard> motherboards;

    public MotherboardBackPortReference(String name) {
        super(name);
    }
}
