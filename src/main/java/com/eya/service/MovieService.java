package com.eya.service;

import com.eya.model.Moviedb;
import com.eya.repository.MovieOperationRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class MovieService {
	@Inject
	private MovieOperationRepository repository;

	public List<Moviedb> findAll() {
		return repository.findAll().stream().toList();
	}

	public Moviedb saveMovie(Moviedb movie) {
		repository.persist(movie);
		return movie;
	}


}
