package com.eya.repository;

import com.eya.model.Moviedb;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface MovieOperationRepository extends PanacheRepository<Moviedb> {
	Moviedb findByName(String name);
}
