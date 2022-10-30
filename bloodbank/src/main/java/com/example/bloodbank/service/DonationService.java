package com.example.bloodbank.service;

import com.example.bloodbank.entity.Donation;
import com.example.bloodbank.repository.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DonationService{

    @Autowired
    private DonationRepository donationRepository;

    public void save(Donation campaign){
        donationRepository.save(campaign);
    }


    public List<Donation> getAll(){
        return (List<Donation>) donationRepository.findAll();
    }

    public void delete(Integer id){
        donationRepository.deleteById(id);
    }

}
