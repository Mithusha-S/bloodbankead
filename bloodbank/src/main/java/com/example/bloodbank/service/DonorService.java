package com.example.bloodbank.service;

import com.example.bloodbank.entity.Campaign;
import com.example.bloodbank.entity.Donor;
import com.example.bloodbank.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DonorService{

    @Autowired(required = true)
    private DonorRepository donorRepository;

    public Donor saveDonor(Donor donor){

        donorRepository.save(donor);
        return donor;
    }

    public Donor update(Donor donor)
    {
        donorRepository.save(donor);
        return donor;
    }

    public List<Donor> getAll(){
        return (List<Donor>) donorRepository.findAll();
    }

    public Donor getDonor(Integer id){
        return donorRepository.findById(id).get();
    }

}