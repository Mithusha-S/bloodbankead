package com.example.bloodbank.controller;

import com.example.bloodbank.entity.Donor;
import com.example.bloodbank.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donors")
public class DonorController {

    @Autowired(required = true)
    private DonorService donorService;


    @PostMapping("/addDonor")
    public ResponseEntity<Donor> addDonor(@RequestBody Donor donor) {
        Donor donor1;
        try {
            donor1=donorService.saveDonor(donor);
            return new ResponseEntity<Donor>(donor1, HttpStatus.OK);

        } catch (Exception ex) {
            return null;
        }
    }

    @GetMapping("/getDonors")
    public List<Donor> getAllDonors(){
        return donorService.getAll();
    }

    @PutMapping("/updateDonor")
    private Donor update(@RequestBody Donor donor)
    {
        donorService.update(donor);
        return  donor;
    }

    @GetMapping("/deleteDonor/{id}")
    public Donor getDonor(@PathVariable Integer id){
        return donorService.getDonor(id);
    }

}
