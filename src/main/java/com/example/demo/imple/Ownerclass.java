package com.example.demo.imple;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Owner;
import com.example.demo.services.OwnerService;


@Service
public class Ownerclass implements Ownerimp{
	


	private final OwnerService ownerservice;
	

	public Ownerclass(OwnerService ownerservice) {
		super();
		this.ownerservice = ownerservice;
	}
	
	public Set<Owner> getOwner() {
		Set<Owner> p=new HashSet<>();
		ownerservice.findAll().iterator().forEachRemaining(p::add);
		return p;
	}


	
	
	
	

}
