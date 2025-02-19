package com.mxrpheus.configurator.repository.reference;

import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface BaseReferenceRepository<T extends BaseReferenceEntity> extends JpaRepository<T, Long> {
    List<T> findByNameContainingIgnoreCase(String name);
    boolean existsByNameIgnoreCase(String name);
}
