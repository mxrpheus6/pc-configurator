package com.mxrpheus.configurator.service.reference.impl;

import com.mxrpheus.configurator.exception.EntityAlreadyExistsException;
import com.mxrpheus.configurator.exception.EntityNotFoundException;
import com.mxrpheus.configurator.model.reference.BaseReferenceEntity;
import com.mxrpheus.configurator.repository.reference.BaseReferenceRepository;
import com.mxrpheus.configurator.service.reference.BaseReferenceService;
import jakarta.transaction.Transactional;

import java.util.List;

@Transactional
public abstract class BaseReferenceServiceImpl<T extends BaseReferenceEntity, R extends BaseReferenceRepository<T>>
        implements BaseReferenceService<T> {

    protected final R repository;
    private final Class<T> entityClass;

    protected BaseReferenceServiceImpl(R repository, Class<T> entityClass) {
        this.repository = repository;
        this.entityClass = entityClass;
    }

    @Override
    public List<T> findAllFiltered(String name) {
        if (name == null) {
            return repository.findAll();
        } else {
            return repository.findByNameContainingIgnoreCase(name);
        }
    }

    @Override
    public T findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException(entityClass, id));
    }

    @Override
    public T save(T entity) {
        if (repository.existsByNameIgnoreCase(entity.getName())) {
            throw new EntityAlreadyExistsException(entityClass, entity.getName());
        }

        entity.setCount(0);
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        T entity = repository.findById(id).orElseThrow(() -> new EntityNotFoundException(entityClass, id));

        repository.delete(entity);
    }
}
