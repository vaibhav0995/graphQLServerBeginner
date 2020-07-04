package com.graphQL.graphQLPoc.graphql.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphQL.graphQLPoc.dao.entity.Vehicle;
import com.graphQL.graphQLPoc.service.VehicleService;

@Component
public class VehicleQuery implements GraphQLQueryResolver {
	@Autowired
	private VehicleService vehicleService;

	public List<Vehicle> getVehicles(final int count) {
		return this.vehicleService.getAllVehicles(count);
	}

	public Optional<Vehicle> getVehicle(final int id) {
		return this.vehicleService.getVehicle(id);
	}
	
	public Vehicle getMostExpensiveVehicle() {
		return this.vehicleService.getMostExpensiveVehicle();
	}
	
	public Vehicle getLeastExpensiveVehicle() {
		return this.vehicleService.getLeastExpensiveVehicle();
	}
}
