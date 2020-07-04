package com.graphQL.graphQLPoc.service;

import java.util.List;
import java.util.Optional;

import com.graphQL.graphQLPoc.dao.entity.Vehicle;

public interface VehicleService {
	public List<Vehicle> getAllVehicles(final int count);

	public Optional<Vehicle> getVehicle(final int id);

	public Vehicle getMostExpensiveVehicle();

	public Vehicle getLeastExpensiveVehicle();
}
