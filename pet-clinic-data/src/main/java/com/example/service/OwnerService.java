package com.example.service;

import com.example.model.Owner;



public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
