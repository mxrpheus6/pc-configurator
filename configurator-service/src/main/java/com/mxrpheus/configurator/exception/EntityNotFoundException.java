package com.mxrpheus.configurator.exception;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(Class<?> entityClass, Long id) {
        super(entityClass.getSimpleName() + " with id=" + id + " not found!");
    }
}
