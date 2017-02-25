package com.mfan.bao;

import java.util.List;

import com.mfan.entity.Movies;

public class MoviesBao {
	
public List<Movies> InsertMoviesList(List<Movies> moviesList){
		//list.stream().forEach(elem -> System.out.println("element " + elem));
		moviesList.stream().forEach(elem -> System.out.println("element " + elem));
		return null;
	}
	//method to insert a movie into the Db
	
	public Movies InsertMovie(Movies movies ){
		
		return movies;
		
	}
	//providing a list of current movies playing
	public List<Movies> GetCurrentMovies(){
		
		return null;
		
	}
	
	//Query for a movie by String and it fetches all the movies by 
	public List<Movies> QueryMovieByName(String MovieName){
		
		return null;
		
	}
}
