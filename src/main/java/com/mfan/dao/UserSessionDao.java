package com.mfan.dao;


import com.mfan.entity.UserSession;

public class UserSessionDao {
	//This class would perform all the CRUD operations
	
			public UserSession InsertUSerSession(UserSession userSession){
				//step to call the jpa class and insert user into the db
				return userSession;
			}
			
			public UserSession QueryUSerSession(UserSession userSession){
				//step to call the jpa class and Query the user from the db
				return userSession;
			}
			
			public UserSession UpdateUSerSession(UserSession userSession){
				//step to call the jpa class and update the iser from the db
				return userSession;
			}
			
			public Boolean DeleteUSerSession(UserSession userSession){
				//step to call the jpa class and inactivate the user from the db.
				return null;
			}
}
