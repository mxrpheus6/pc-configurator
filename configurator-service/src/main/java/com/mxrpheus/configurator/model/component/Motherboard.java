package com.mxrpheus.configurator.model.component;

import com.mxrpheus.configurator.model.reference.motherboard.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

    @OneToMany(mappedBy = "motherboard", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MotherboardSataControllerMapping> sataControllers;

    @OneToMany(mappedBy = "motherboard", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MotherboardExpansionSlotMapping> expansionSlots;

    @ManyToOne
    @JoinColumn(name = "integrated_graphics_id", nullable = false)
    private MotherboardIntegratedGraphicsReference integratedGraphics;

    @OneToMany(mappedBy = "motherboard", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MotherboardNetworkInterfaceMapping> networkInterfaces;

    @OneToMany(mappedBy = "motherboard", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MotherboardBackPortMapping> backPorts;

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