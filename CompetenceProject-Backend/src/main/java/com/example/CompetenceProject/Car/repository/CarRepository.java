package com.example.CompetenceProject.Car.repository;

import com.example.CompetenceProject.Car.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
