package com.example.demo.services;



import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Owner;

public interface OwnerService extends CrudRepository<Owner,Long>{

}
