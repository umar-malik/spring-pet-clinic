package com.enhancedcoder.springpetclinic.services;

import com.enhancedcoder.springpetclinic.model.Pet;

import java.util.Set;

public interface CrudService<T, ID> {
    T findById(ID id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
