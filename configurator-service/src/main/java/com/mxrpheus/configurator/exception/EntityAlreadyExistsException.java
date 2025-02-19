package com.mxrpheus.configurator.exception;

public class EntityAlreadyExistsException extends RuntimeException{
    public EntityAlreadyExistsException(Class<?> entityClass, String name) {
        super(entityClass.getSimpleName() + " with name=" + name + " already exists!");
    }
}
