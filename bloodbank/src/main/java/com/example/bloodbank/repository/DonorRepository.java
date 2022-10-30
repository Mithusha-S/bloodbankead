package com.example.bloodbank.repository;

import com.example.bloodbank.entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DonorRepository extends JpaRepository<Donor, Integer> {
}
