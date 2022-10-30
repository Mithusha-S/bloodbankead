package com.example.bloodbank.repository;

import com.example.bloodbank.entity.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DonationRepository extends JpaRepository<Donation, Integer> {
}
