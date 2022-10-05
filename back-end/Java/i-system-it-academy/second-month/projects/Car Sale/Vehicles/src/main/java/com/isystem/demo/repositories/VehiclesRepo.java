package com.isystem.demo.repositories;

import com.isystem.demo.model.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiclesRepo extends JpaRepository<Vehicles, Long> {
}
