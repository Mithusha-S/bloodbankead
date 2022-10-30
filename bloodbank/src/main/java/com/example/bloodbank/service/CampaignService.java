package com.example.bloodbank.service;

import com.example.bloodbank.entity.Campaign;
import com.example.bloodbank.repository.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CampaignService{

    @Autowired(required = true)
    private  CampaignRepository campaignRepository;


    public  Campaign update(Campaign campaign)
    {
        campaignRepository.save(campaign);
        return campaign;
    }
    public Campaign saveCampaign(Campaign campaign){

        campaignRepository.save(campaign);
        return campaign;
    }


    public List<Campaign> getAll(){
        return (List<Campaign>) campaignRepository.findAll();
    }

    public void delete(Integer id){
        campaignRepository.deleteById(id);
    }


}