-- Form Factors
INSERT INTO motherboard_form_factor_reference (id, name, count) VALUES (1, 'ATX', 3);
INSERT INTO motherboard_form_factor_reference (id, name, count) VALUES (2, 'Micro-ATX', 1);
INSERT INTO motherboard_form_factor_reference (id, name, count) VALUES (3, 'Mini-ITX', 1);
INSERT INTO motherboard_form_factor_reference (id, name, count) VALUES (4, 'E-ATX', 0);
INSERT INTO motherboard_form_factor_reference (id, name, count) VALUES (5, 'XL-ATX', 0);

-- Sockets
INSERT INTO motherboard_socket_reference (id, name, count) VALUES (1, 'LGA 1700', 2);
INSERT INTO motherboard_socket_reference (id, name, count) VALUES (2, 'AM5', 1);
INSERT INTO motherboard_socket_reference (id, name, count) VALUES (3, 'LGA 1200', 1);
INSERT INTO motherboard_socket_reference (id, name, count) VALUES (4, 'AM4', 1);
INSERT INTO motherboard_socket_reference (id, name, count) VALUES (5, 'TR4', 0);

-- Chipsets
INSERT INTO motherboard_chipset_reference (id, name, count) VALUES (1, 'Intel Z790', 2);
INSERT INTO motherboard_chipset_reference (id, name, count) VALUES (2, 'Intel B760', 1);
INSERT INTO motherboard_chipset_reference (id, name, count) VALUES (3, 'AMD X670', 1);
INSERT INTO motherboard_chipset_reference (id, name, count) VALUES (4, 'AMD B650', 1);
INSERT INTO motherboard_chipset_reference (id, name, count) VALUES (5, 'Intel H770', 0);

-- Memory Types
INSERT INTO motherboard_memory_type_reference (id, name, count) VALUES (1, 'DDR4', 3);
INSERT INTO motherboard_memory_type_reference (id, name, count) VALUES (2, 'DDR5', 2);
INSERT INTO motherboard_memory_type_reference (id, name, count) VALUES (3, 'DDR3', 0);
INSERT INTO motherboard_memory_type_reference (id, name, count) VALUES (4, 'LPDDR5X', 0);
INSERT INTO motherboard_memory_type_reference (id, name, count) VALUES (5, 'GDDR6', 0);

-- Memory Slot Counts
INSERT INTO motherboard_memory_slot_count_reference (id, name, count) VALUES (1, '2', 1);
INSERT INTO motherboard_memory_slot_count_reference (id, name, count) VALUES (2, '4', 3);
INSERT INTO motherboard_memory_slot_count_reference (id, name, count) VALUES (3, '8', 1);
INSERT INTO motherboard_memory_slot_count_reference (id, name, count) VALUES (4, '16', 0);
INSERT INTO motherboard_memory_slot_count_reference (id, name, count) VALUES (5, '1', 0);

-- SATA Controllers
INSERT INTO motherboard_sata_controller_reference (id, name, count) VALUES (1, 'Intel RST', 3);
INSERT INTO motherboard_sata_controller_reference (id, name, count) VALUES (2, 'AMD SATA', 2);
INSERT INTO motherboard_sata_controller_reference (id, name, count) VALUES (3, 'Marvell HyperDuo', 0);
INSERT INTO motherboard_sata_controller_reference (id, name, count) VALUES (4, 'ASMedia 106x', 0);
INSERT INTO motherboard_sata_controller_reference (id, name, count) VALUES (5, 'JMicron JMB36X', 0);

-- Expansion Slots
INSERT INTO motherboard_expansion_slot_reference (id, name, count) VALUES (1, 'PCIe 4.0 x16', 3);
INSERT INTO motherboard_expansion_slot_reference (id, name, count) VALUES (2, 'PCIe 3.0 x16', 2);
INSERT INTO motherboard_expansion_slot_reference (id, name, count) VALUES (3, 'PCIe 4.0 x8', 1);
INSERT INTO motherboard_expansion_slot_reference (id, name, count) VALUES (4, 'PCIe 5.0 x16', 1);
INSERT INTO motherboard_expansion_slot_reference (id, name, count) VALUES (5, 'PCI', 0);

-- Integrated Graphics
INSERT INTO motherboard_integrated_graphics_reference (id, name, count) VALUES (1, 'Intel UHD 770', 2);
INSERT INTO motherboard_integrated_graphics_reference (id, name, count) VALUES (2, 'Intel Iris Xe', 1);
INSERT INTO motherboard_integrated_graphics_reference (id, name, count) VALUES (3, 'AMD Radeon Vega 8', 1);
INSERT INTO motherboard_integrated_graphics_reference (id, name, count) VALUES (4, 'AMD Radeon 680M', 1);
INSERT INTO motherboard_integrated_graphics_reference (id, name, count) VALUES (5, 'Нет', 0);

-- Network Interfaces
INSERT INTO motherboard_network_interface_reference (id, name, count) VALUES (1, 'Realtek 2.5G LAN', 3);
INSERT INTO motherboard_network_interface_reference (id, name, count) VALUES (2, 'Intel I225-V 2.5G LAN', 2);
INSERT INTO motherboard_network_interface_reference (id, name, count) VALUES (3, 'Killer E3100G 2.5G', 1);
INSERT INTO motherboard_network_interface_reference (id, name, count) VALUES (4, 'Wi-Fi 6E + Bluetooth 5.2', 2);
INSERT INTO motherboard_network_interface_reference (id, name, count) VALUES (5, 'Нет', 0);

-- Back Ports
INSERT INTO motherboard_back_port_reference (id, name, count) VALUES (1, 'USB 3.2 Gen2 Type-C', 4);
INSERT INTO motherboard_back_port_reference (id, name, count) VALUES (2, 'HDMI 2.1', 3);
INSERT INTO motherboard_back_port_reference (id, name, count) VALUES (3, 'DisplayPort 1.4', 2);
INSERT INTO motherboard_back_port_reference (id, name, count) VALUES (4, 'RJ-45 Ethernet', 4);
INSERT INTO motherboard_back_port_reference (id, name, count) VALUES (5, 'Нет', 0);

-- Features
INSERT INTO motherboard_feature_reference (id, name, count) VALUES (1, 'RGB-подсветка', 2);
INSERT INTO motherboard_feature_reference (id, name, count) VALUES (2, 'BIOS Flashback', 3);
INSERT INTO motherboard_feature_reference (id, name, count) VALUES (3, 'Dual BIOS', 1);
INSERT INTO motherboard_feature_reference (id, name, count) VALUES (4, 'Reinforced PCIe Slots', 2);
INSERT INTO motherboard_feature_reference (id, name, count) VALUES (5, 'Нет', 0);

-- Power Phases
INSERT INTO motherboard_power_phases_reference (id, name, count) VALUES (1, '10+1', 2);
INSERT INTO motherboard_power_phases_reference (id, name, count) VALUES (2, '12+2', 2);
INSERT INTO motherboard_power_phases_reference (id, name, count) VALUES (3, '8+1', 1);
INSERT INTO motherboard_power_phases_reference (id, name, count) VALUES (4, '16+1', 0);
INSERT INTO motherboard_power_phases_reference (id, name, count) VALUES (5, 'Нет', 0);

-- Motherboards
INSERT INTO motherboard (id, form_factor_id, socket_id, chipset_id, memory_type_id, memory_slot_count_id, integrated_graphics_id, power_phase_id, article_number, brand, brand_website, name, price)
VALUES (1, 1, 1, 1, 1, 2, 1, 1, 'AB12345', 'ASUS', 'https://www.asus.com', 'ASUS Prime Z690-A', 299.99);

INSERT INTO motherboard (id, form_factor_id, socket_id, chipset_id, memory_type_id, memory_slot_count_id, integrated_graphics_id, power_phase_id, article_number, brand, brand_website, name, price)
VALUES (2, 2, 2, 2, 2, 3, 2, 2, 'CD67890', 'MSI', 'https://www.msi.com', 'MSI MAG B550 TOMAHAWK', 179.99);

INSERT INTO motherboard (id, form_factor_id, socket_id, chipset_id, memory_type_id, memory_slot_count_id, integrated_graphics_id, power_phase_id, article_number, brand, brand_website, name, price)
VALUES (3, 3, 3, 3, 1, 1, 3, 3, 'EF11223', 'Gigabyte', 'https://www.gigabyte.com', 'Gigabyte AORUS Z390', 229.99);

INSERT INTO motherboard (id, form_factor_id, socket_id, chipset_id, memory_type_id, memory_slot_count_id, integrated_graphics_id, power_phase_id, article_number, brand, brand_website, name, price)
VALUES (4, 1, 4, 4, 2, 4, 4, 1, 'GH44556', 'ASRock', 'https://www.asrock.com', 'ASRock Z590 Extreme4', 159.99);

INSERT INTO motherboard (id, form_factor_id, socket_id, chipset_id, memory_type_id, memory_slot_count_id, integrated_graphics_id, power_phase_id, article_number, brand, brand_website, name, price)
VALUES (5, 2, 2, 2, 1, 2, 5, 2, 'IJ78901', 'MSI', 'https://www.msi.com', 'MSI B450M PRO-VDH MAX', 109.99);
