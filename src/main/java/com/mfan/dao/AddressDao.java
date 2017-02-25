package com.mfan.dao;

import com.mfan.entity.Address;


public class AddressDao {
	//This class would perform all the CRUD operations
	
			public Address InsertAddress(Address address){
				//step to call the jpa class and insert Address into the db
				return address;
			}
			
			public Address QueryAddress(Address address){
				//step to call the jpa class and Query the Address from the db
				return address;
			}
			
			public Address UpdateAddress(Address address){
				//step to call the jpa class and update the iser from the db
				return address;
			}
			
			public Boolean DeleteAddress(Address address){
				//step to call the jpa class and inactivate the Address from the db.
				return null;
			}
}
