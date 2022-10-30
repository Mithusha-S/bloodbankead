package com.example.bloodbank.controller;

import com.example.bloodbank.entity.Donation;
import com.example.bloodbank.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donations")
public class DonationController {

    @Autowired
    private DonationService donationService;

    @PostMapping("/addDonation")
    public void addDonation(@RequestBody Donation donation){
        donationService.save(donation);
    }

    @GetMapping("/getDonation")
    public List<Donation> getAllDonations(){
        return donationService.getAll();
    }

    @DeleteMapping("/deleteDonation/{id}")
    public void deleteDonations(@PathVariable Integer id){
        donationService.delete(id);
    }

}