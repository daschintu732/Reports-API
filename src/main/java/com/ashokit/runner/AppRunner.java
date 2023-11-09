package com.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ashokit.entity.EligibilityDetails;
import com.ashokit.repo.EligibilityRepo;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	private EligibilityRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		EligibilityDetails data1 = new EligibilityDetails();
		data1.setEligId(1);
		data1.setName("Chin2");
		data1.setEmail("daschintu732@gmail.com");
		data1.setMobile(9438593126L);
		data1.setAadhar(6363024094L);
		data1.setPlanName("SBMS");
		data1.setPlanStatus("APPROVED");
		repo.save(data1);

		EligibilityDetails data2 = new EligibilityDetails();
		data2.setEligId(2);
		data2.setName("Kavya");
		data2.setEmail("kavyamaran74@gmail.com");
		data2.setMobile(9658658726L);
		data2.setAadhar(4785214693L);
		data2.setPlanName("JRTP");
		data2.setPlanStatus("DENIED");
		repo.save(data2);

		EligibilityDetails data3 = new EligibilityDetails();
		data3.setEligId(3);
		data3.setName("Simran");
		data3.setEmail("dollsimran143@gmail.com");
		data3.setMobile(8327736714L);
		data3.setAadhar(8745245658L);
		data3.setPlanName("SDLC");
		data3.setPlanStatus("APPROVED");
		repo.save(data3);

		EligibilityDetails data4 = new EligibilityDetails();
		data4.setEligId(4);
		data4.setName("Anjan");
		data4.setEmail("anjankumar17@gmail.com");
		data4.setMobile(7064674988L);
		data4.setAadhar(7329571156L);
		data4.setPlanName("JFSD");
		data4.setPlanStatus("CANCELLED");
		repo.save(data4);

		EligibilityDetails data5 = new EligibilityDetails();
		data5.setEligId(5);
		data5.setName("Prativa");
		data5.setEmail("pratibha69@gmail.com");
		data5.setMobile(6370350714L);
		data5.setAadhar(2541638787L);
		data5.setPlanName("SNAP");
		data5.setPlanStatus("APPROVED");
		repo.save(data5);
	}
}