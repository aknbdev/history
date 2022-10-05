package com.isystem.demo.services;
import com.isystem.demo.model.Vehicles;
import com.isystem.demo.repositories.VehiclesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehiclesService {
    @Autowired
    private VehiclesRepo vehiclesRepo;
    public ResponseEntity<?> newVehicle(Vehicles requestVehicle) {
        vehiclesRepo.save(requestVehicle);
        return new ResponseEntity<>("Ok, a new Vehicles added.", HttpStatus.CREATED);
    }

    public ResponseEntity<?> findById(Long id) {
        Optional<Vehicles> vehicles = vehiclesRepo.findById(id);
        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }

    public ResponseEntity<?> updateVehicles(Long id, Vehicles requestVehicles) {
        requestVehicles.setId(id);
        vehiclesRepo.save(requestVehicles);
        return new ResponseEntity<>("Everything is ok, Vehicles info updated.", HttpStatus.OK);
    }

    public ResponseEntity<?> deleteById(Long id) {
        ResponseEntity<?> vehicles = deleteById(id);
        return new ResponseEntity<>("Ok , deleted.", HttpStatus.OK);
    }
}
