package com.mfan.dao;


import com.mfan.entity.User;

public class UserDao {
	//This class would perform all the CRUD operations
	
		public User InsertUser(User user){
			//step to call the jpa class and insert user into the db
			return user;
		}
		
		public User QueryUser(User user){
			//step to call the jpa class and Query the user from the db
			return user;
		}
		
		public User UpdateUser(User user){
			//step to call the jpa class and update the iser from the db
			return user;
		}
		
		public Boolean DeleteUser(User user){
			//step to call the jpa class and inactivate the user from the db.
			return null;
		}
}
