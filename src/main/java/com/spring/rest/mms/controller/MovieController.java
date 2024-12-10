package com.spring.rest.mms.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.mms.entity.Movie;
import com.spring.rest.mms.service.MovieService;
import com.spring.rest.mms.util.ResposneStructure;

@RestController
public class MovieController {

	private final MovieService movieService;

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	static <T> ResponseEntity<ResposneStructure<T>> sendingResponse(int status, String message, T data) {
		ResposneStructure<T> resposneStructure = ResposneStructure.create(status, message, data);
		return ResponseEntity.status(status).body(resposneStructure);
	}

	@PostMapping("/save-movie")
	public ResponseEntity<ResposneStructure<Movie>> saveMovie(@RequestBody Movie movie){
		movie = movieService.saveMovie(movie);
		return sendingResponse(HttpStatus.CREATED.value(), "Movie-Saved", movie);
	}

	@GetMapping("/find-movie-by-id")
	public ResponseEntity<ResposneStructure<Movie>> findMovie(@RequestParam int id){
		Movie movie = movieService.findMovie(id);
		return sendingResponse(HttpStatus.FOUND.value(), "Movie-Found", movie);
	}

	@DeleteMapping("/delete-move")
	public ResponseEntity<ResposneStructure<Movie>> deleteMovie(@RequestParam int id){
		Movie movie = movieService.deleteMovie(id);
		return sendingResponse(HttpStatus.OK.value(), "Movie-Deleted", movie);
	}

	@PutMapping("/update-movie")
	public ResponseEntity<ResposneStructure<Movie>> updateMovie(@RequestBody Movie movie){
		movie = movieService.updateMovie(movie);
		return sendingResponse(HttpStatus.OK.value(), "Movie-Updated", movie);
	}

	@GetMapping("/find-all-movie")
	public ResponseEntity<ResposneStructure<List<Movie>>> getAllMovie(){
		List<Movie> list = movieService.getAllMovie();
		return sendingResponse(HttpStatus.FOUND.value(), "All-Movie-Found", list);
	}
}
