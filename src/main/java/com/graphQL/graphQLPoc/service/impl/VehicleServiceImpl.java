package com.graphQL.graphQLPoc.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphQL.graphQLPoc.dao.entity.Vehicle;
import com.graphQL.graphQLPoc.dao.repository.VehicleRepository;
import com.graphQL.graphQLPoc.service.VehicleService;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public List<Vehicle> getAllVehicles(int count) {
		return this.vehicleRepository.findAll().stream().limit(count).collect(Collectors.toList());
	}

	@Override
	public Optional<Vehicle> getVehicle(int id) {
		return this.vehicleRepository.findById(id);
	}

	@Override
	public Vehicle getMostExpensiveVehicle() {
		return this.vehicleRepository.findAll().stream().max(Comparator.comparing(Vehicle::getShowRoomPrice)).get();
	}
	
	@Override
	public Vehicle getLeastExpensiveVehicle() {
		return this.vehicleRepository.findAll().stream().min(Comparator.comparing(Vehicle::getShowRoomPrice)).get();
	}

}
