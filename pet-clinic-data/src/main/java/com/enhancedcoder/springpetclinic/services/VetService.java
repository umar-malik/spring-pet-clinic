package com.enhancedcoder.springpetclinic.services;

import com.enhancedcoder.springpetclinic.model.Pet;
import com.enhancedcoder.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
