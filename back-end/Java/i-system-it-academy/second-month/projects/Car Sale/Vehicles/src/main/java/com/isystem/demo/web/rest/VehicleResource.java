package com.isystem.demo.web.rest;
import com.isystem.demo.model.Vehicles;
import com.isystem.demo.services.VehiclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleResource {
    @Autowired
    private VehiclesService vehiclesService;

    // |- A new vehicle -|
    @PostMapping
    public ResponseEntity<?> newVehicle(@RequestBody Vehicles requestVehicle){
        return vehiclesService.newVehicle(requestVehicle);
    }

    // |- Get by id -|
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id){
        return vehiclesService.findById(id);
    }

    // |- Update Vehicles -|
    @PutMapping("/{id}")
    public ResponseEntity<?> updateVehicles(
            @PathVariable("id") Long id,
            @RequestBody Vehicles requestVehicles){
        return vehiclesService.updateVehicles(id, requestVehicles);
    }

    // |- Delete Vehicles -|
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
        return vehiclesService.deleteById(id);
    }
}
