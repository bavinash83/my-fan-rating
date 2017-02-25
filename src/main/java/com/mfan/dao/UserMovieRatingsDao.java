package com.mfan.dao;

import com.mfan.entity.UserMovieRatings;

public class UserMovieRatingsDao {
	//This class would perform all the CRUD operations
	
			public UserMovieRatings InsertUserMovieRatings(UserMovieRatings userMovieRatings){
				//step to call the jpa class and insert userMovieRatings into the db
				return userMovieRatings;
			}
			
			public UserMovieRatings QueryUserMovieRatings(UserMovieRatings userMovieRatings){
				//step to call the jpa class and Query the userMovieRatings from the db
				return userMovieRatings;
			}
			
			public UserMovieRatings UpdateUserMovieRatings(UserMovieRatings userMovieRatings){
				//step to call the jpa class and update the iser from the db
				return userMovieRatings;
			}
			
			public Boolean DeleteUserMovieRatings(UserMovieRatings userMovieRatings){
				//step to call the jpa class and inactivate the userMovieRatings from the db.
				return null;
			}
}
