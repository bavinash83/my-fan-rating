package com.mfan.dao;

import com.mfan.entity.MovieComments;

public class MovieCommentsDao {
	//This class would perform all the CRUD operations
	
	public MovieComments InsertMovieComments(MovieComments movieComments){
		//step to call the jpa class and insert MovieComments into the db
		return movieComments;
	}
	
	public MovieComments QueryMovieComments(MovieComments movieComments){
		//step to call the jpa class and Query the MovieComments from the db
		return movieComments;
	}
	
	public MovieComments UpdateMovieComments(MovieComments movieComments){
		//step to call the jpa class and update the iser from the db
		return movieComments;
	}
	
	public Boolean DeleteMovieComments(MovieComments movieComments){
		//step to call the jpa class and inactivate the MovieComments from the db.
		return null;
	}
}
