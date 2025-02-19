package com.mxrpheus.configurator.service.reference;

import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;

import java.util.List;

public interface BaseReferenceService<T extends BaseReferenceEntity> {
    List<T> findAllFiltered(String name);
    T findById(Long id);
}
