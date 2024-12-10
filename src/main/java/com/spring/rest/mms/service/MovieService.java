package com.spring.rest.mms.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.spring.rest.mms.entity.Movie;
import com.spring.rest.mms.exception.MovieNotFoundByIdException;
import com.spring.rest.mms.repository.MovieRepository;

@Service
public class MovieService {

	private final MovieRepository movieRepository;

	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	public Movie findMovie(int id) {
		return movieRepository.findById(id)
				.orElseThrow(()-> new MovieNotFoundByIdException("Failed to find the Movie"));
	}

	public Movie deleteMovie(int id) {
		Optional<Movie> optional =  movieRepository.findById(id);
		if (optional.isPresent()) {
			Movie movie = optional.get();
			movieRepository.delete(movie);
			return movie;
		} else {
			throw new MovieNotFoundByIdException("Failed to find the Movie");
		}
	}

	public Movie updateMovie(Movie movie) {
		Optional<Movie> optional = movieRepository.findById(movie.getId());
		if (optional.isPresent()) {
			return movieRepository.save(movie);
		} else {
			throw new MovieNotFoundByIdException("Failed to find the Movie");
		}
	}

	public List<Movie> getAllMovie() {
		return movieRepository.findAll();
	}
}