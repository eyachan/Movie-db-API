package com.eya.repository;

import com.eya.model.Moviedb;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MovieOperationRepoImpl implements MovieOperationRepository {
	@Override
	public Moviedb findByName(String name) {
		return find("primarytitle", name).firstResult();
	}
}
