package com.mfan.bao;

import com.mfan.entity.Address;
import com.mfan.entity.User;

public class AddressBao {
	
	//Inserting an address for a user
	public Address InserAddress(Address address){
		AddressValidation addressValidation = new AddressValidation();
		String valiationValue = addressValidation.ValidateAddress(address);
		if(valiationValue == "TRUE"){
			return address;
		}else{
			return null;
		}
		
	}
	
	//Updating an address for a user
	public Address UpdateAddress(Address address){
		AddressValidation addressValidation = new AddressValidation();
		String valiationValue = addressValidation.ValidateAddress(address);
		if(valiationValue == "TRUE"){
			return address;
		}else{
			return null;
		}
	}
	
	//Querying the address of a user
	public Address QueryAddress(User user){
		Address address =  new Address();
		
		//call the AddressDao to query with the userEmailAddress
		return address;
	}
}
