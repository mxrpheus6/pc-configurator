package com.mxrpheus.configurator.model.component;

import com.mxrpheus.configurator.model.reference.motherboard.*;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "motherboard")
public class Motherboard extends Component {

    @ManyToOne
    @JoinColumn(name = "form_factor_id", nullable = false)
    private MotherboardFormFactorReference formFactor;

    @ManyToOne
    @JoinColumn(name = "socket_id", nullable = false)
    private MotherboardSocketReference socket;

    @ManyToOne
    @JoinColumn(name = "chipset_id", nullable = false)
    private MotherboardChipsetReference chipset;

    @ManyToOne
    @JoinColumn(name = "memory_type_id", nullable = false)
    private MotherboardMemoryTypeReference memoryType;

    @ManyToOne
    @JoinColumn(name = "memory_slot_count_id", nullable = false)
    private MotherboardMemorySlotCountReference memorySlotsCount;

    @ManyToMany
    @JoinTable(
            name = "motherboard_sata_controller_mapping",
            joinColumns = @JoinColumn(name = "motherboard_id"),
            inverseJoinColumns = @JoinColumn(name = "sata_controller_id")
    )
    private List<MotherboardSataControllerReference> sataControllers;

    @ManyToMany
    @JoinTable(
            name = "motherboard_expansion_slot_mapping",
            joinColumns = @JoinColumn(name = "motherboard_id"),
            inverseJoinColumns = @JoinColumn(name = "expansion_slot_id")
    )
    private List<MotherboardExpansionSlotReference> expansionSlots;

    @ManyToOne
    @JoinColumn(name = "integratedGraphics_id", nullable = false)
    private MotherboardIntegratedGraphicsReference integratedGraphics;

    @ManyToMany
    @JoinTable(
            name = "motherboard_network_interface_mapping",
            joinColumns = @JoinColumn(name = "motherboard_id"),
            inverseJoinColumns = @JoinColumn(name = "network_interface_id")
    )
    private List<MotherboardNetworkInterfaceReference> networkInterfaces;

    @ManyToMany
    @JoinTable(
            name = "motherboard_back_port_mapping",
            joinColumns = @JoinColumn(name = "back_port_id"),
            inverseJoinColumns = @JoinColumn(name = "network_interface_id")
    )
    private List<MotherboardBackPortReference> backPorts;

    @ManyToMany
    @JoinTable(
            name = "motherboard_feature_mapping",
            joinColumns = @JoinColumn(name = "motherboard_id"),
            inverseJoinColumns = @JoinColumn(name = "feature_id")
    )
    private List<MotherboardFeatureReference> features;

    @ManyToOne
    @JoinColumn(name = "power_phase_id", nullable = false)
    private MotherboardPowerPhasesReference powerPhases;
}