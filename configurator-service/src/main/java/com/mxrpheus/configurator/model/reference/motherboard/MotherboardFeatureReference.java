package com.mxrpheus.configurator.model.reference.motherboard;

import com.mxrpheus.configurator.model.component.Motherboard;
import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "motherboard_feature_reference")
public class MotherboardFeatureReference extends BaseReferenceEntity {

    @ManyToMany(mappedBy = "features")
    private List<Motherboard> motherboards;

    public MotherboardFeatureReference(String name) {
        super(name);
    }
}
