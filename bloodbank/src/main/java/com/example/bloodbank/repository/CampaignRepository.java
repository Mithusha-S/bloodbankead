package com.example.bloodbank.repository;

import com.example.bloodbank.entity.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Integer> {

}
