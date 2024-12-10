package com.spring.rest.mms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.spring.rest.mms.util.ErrorStructure;

@RestControllerAdvice
public class ApplicationExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<ErrorStructure> handleMovieNotFoundById(MovieNotFoundByIdException ex){
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(ErrorStructure.create(HttpStatus.NOT_FOUND.value(), ex.getMessage(), "Movie not found by the given Id"));
	}
}