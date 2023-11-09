package com.ashokit.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchRequest {
	
	private String planName;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Integer eligId;
	private String name;
	private String email;
	private Long mobile;
	private Long aadhar;
}