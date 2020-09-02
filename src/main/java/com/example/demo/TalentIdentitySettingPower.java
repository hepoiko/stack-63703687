package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TalentIdentitySettingPower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDENTITY_SETTING_ID", nullable = false)
    private TalentIdentitySetting setting;

    public TalentIdentitySettingPower(TalentIdentitySetting setting) {
        this.setting = setting;
    }


    public int getId()
    {
        return id;
    }


    public void setId(int id)
    {
        this.id = id;
    }


    public TalentIdentitySetting getSetting()
    {
        return setting;
    }


    public void setSetting(TalentIdentitySetting setting)
    {
        this.setting = setting;
    }
    
   
    
}