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
@Table(name = "motherboard_memory_slot_count_reference")
public class MotherboardMemorySlotCountReference extends BaseReferenceEntity {
    public MotherboardMemorySlotCountReference(String name) {
        super(name);
    }
}
