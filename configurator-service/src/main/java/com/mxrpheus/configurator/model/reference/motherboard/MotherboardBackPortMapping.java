package com.mxrpheus.configurator.model.reference.motherboard;

import com.mxrpheus.configurator.model.component.Motherboard;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "motherboard_back_port_mapping")
public class MotherboardBackPortMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "motherboard_id", nullable = false)
    private Motherboard motherboard;

    @ManyToOne
    @JoinColumn(name = "back_port_id", nullable = false)
    private MotherboardBackPortReference backPort;

    private int amount;
}
