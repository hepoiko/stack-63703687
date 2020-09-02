package com.example.demo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class TalentIdentitySetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "setting", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<TalentIdentitySettingPower> settingPowers;


    public int getId()
    {
        return id;
    }


    public void setId(int id)
    {
        this.id = id;
    }


    public Set<TalentIdentitySettingPower> getSettingPowers()
    {
        return settingPowers;
    }


    public void setSettingPowers(Set<TalentIdentitySettingPower> settingPowers)
    {
        this.settingPowers = settingPowers;
    }

    
   
    
}