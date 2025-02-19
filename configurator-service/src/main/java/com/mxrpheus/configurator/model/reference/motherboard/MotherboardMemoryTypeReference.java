package com.mxrpheus.configurator.model.reference.motherboard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mxrpheus.configurator.model.component.Motherboard;
import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "motherboard_memory_type_reference")
public class MotherboardMemoryTypeReference extends BaseReferenceEntity {

    @JsonIgnore
    @OneToMany(mappedBy = "memoryType", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Motherboard> motherboards;

    public MotherboardMemoryTypeReference(String name) {
        super(name);
    }
}
