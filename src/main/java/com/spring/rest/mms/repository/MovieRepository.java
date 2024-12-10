package com.spring.rest.mms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.rest.mms.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>  {

}
