package com.mxrpheus.configurator.model.reference.motherboard;

import com.mxrpheus.configurator.model.component.Motherboard;
import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "motherboard_expansion_slot_reference")
public class MotherboardExpansionSlotReference extends BaseReferenceEntity {

    @ManyToMany(mappedBy = "expansionSlots")
    private List<Motherboard> motherboards;

    public MotherboardExpansionSlotReference(String name) {
        super(name);
    }
}
