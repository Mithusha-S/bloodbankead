package com.example.bloodbank.entity;

import javax.persistence.*;

@Table(name="donation")
@Entity
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "donation_id")
    private Integer donation_id;

    @Column(name = "donor_id")
    private Integer donor_id;

    @Column(name = "campaign_id")
    private Integer campaign_id;

    @Column(name = "donor_condition")
    private String donor_condition;

    @Column(name = "blood_status")
    private Character blood_status;

    public Donation(Integer donation_id, Integer donor_id, Integer campaign_id, String donor_condition, Character blood_status) {
        this.donation_id = donation_id;
        this.donor_id = donor_id;
        this.campaign_id = campaign_id;
        this.donor_condition = donor_condition;
        this.blood_status = blood_status;
    }

    public Donation(){ }

    public Integer getDonation_id() {
        return donation_id;
    }

    public Integer getDonor_id() {
        return donor_id;
    }

    public Integer getCampaign_id() {
        return campaign_id;
    }

    public String getDonor_condition() {
        return donor_condition;
    }

    public Character getBlood_status() {
        return blood_status;
    }

    public void setDonation_id(Integer donation_id) {
        this.donation_id = donation_id;
    }

    public void setDonor_id(Integer donor_id) {
        this.donor_id = donor_id;
    }

    public void setCampaign_id(Integer campaign_id) {
        this.campaign_id = campaign_id;
    }

    public void setDonor_condition(String donor_condition) {
        this.donor_condition = donor_condition;
    }

    public void setBlood_status(Character blood_status) {
        this.blood_status = blood_status;
    }
}
