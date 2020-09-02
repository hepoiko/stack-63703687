package com.example.demo;

import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner
{

	@Autowired
	private TalentIdentitySettingRepository repository;

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception
	{
		logger.info("Prepare DB");
		TalentIdentitySetting setting = new TalentIdentitySetting();
		HashSet<TalentIdentitySettingPower> powers = new HashSet<>();
		powers.add(new TalentIdentitySettingPower(setting));
		powers.add(new TalentIdentitySettingPower(setting));
		powers.add(new TalentIdentitySettingPower(setting));
		setting.setSettingPowers(powers);
		repository.save(setting);
		logger.info("Finish");
	}

}
