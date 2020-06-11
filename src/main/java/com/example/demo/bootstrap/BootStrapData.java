package com.example.demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Owner;
import com.example.demo.services.OwnerService;

@Component
public class BootStrapData implements CommandLineRunner {
	
	private final OwnerService ownerservice;

	public BootStrapData(OwnerService ownerservice) {
		this.ownerservice = ownerservice;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Owner a=new Owner("sai","dinesh");
		ownerservice.save(a);
		Owner b=new Owner("rohit","khandelwal");
		ownerservice.save(b);
		
		
	}
	

}
