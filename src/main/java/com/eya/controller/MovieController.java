package com.eya.controller;

import com.eya.model.Moviedb;
import com.eya.service.MovieService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/movie")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieController {

	@Inject
	MovieService service;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Moviedb> hello() {
		return service.findAll();
	}
}
