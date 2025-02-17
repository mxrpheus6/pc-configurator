package com.mxrpheus.configurator.model.reference.motherboard;

import com.mxrpheus.configurator.model.component.Motherboard;
import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "motherboard_network_interface_reference")
public class MotherboardNetworkInterfaceReference extends BaseReferenceEntity {

    @ManyToMany(mappedBy = "networkInterfaces")
    private List<Motherboard> motherboards;

    public MotherboardNetworkInterfaceReference(String name) {
        super(name);
    }
}
