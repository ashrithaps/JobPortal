package com.uvce.rest.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")
public class PortalRestInterface {
	public static List<Company> companies = new ArrayList<Company>();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("companies")
	public List<Company> getCompanies() {
		return companies;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("companies")
	public String addCompany(Company company) {
		companies.add(company);
		return "success";
	}
}
