package com.enhancedcoder.springpetclinic.services;

import com.enhancedcoder.springpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
