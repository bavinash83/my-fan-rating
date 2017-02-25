package com.mfan.dao;

import com.mfan.entity.SessionUsage;

public class SessionUsageDao {
	//This class would perform all the CRUD operations
	
	public SessionUsage InsertUSerSession(SessionUsage sessionUsage){
		//step to call the jpa class and insert user into the db
		return sessionUsage;
	}
	
	public SessionUsage QueryUSerSession(SessionUsage sessionUsage){
		//step to call the jpa class and Query the user from the db
		return sessionUsage;
	}
	
/*	public SessionUsage UpdateUSerSession(SessionUsage sessionUsage){
		//step to call the jpa class and update the iser from the db
		return sessionUsage;
	}*/
	
/*	public Boolean DeleteUSerSession(SessionUsage sessionUsage){
		//step to call the jpa class and inactivate the user from the db.
		return null;
	}*/
}
