package com.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ELIGIBILITY")
public class EligibilityDetails {
	
	@Id
	@GeneratedValue
	private Integer eligId;
	private String name;
	private String email;
	private Long mobile;
	private Long aadhar;
	private String planName;
	private String planStatus;
	private String createdBy;
	private LocalDate createDate;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
}