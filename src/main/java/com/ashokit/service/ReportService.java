package com.ashokit.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.ashokit.request.SearchRequest;
import com.ashokit.response.SearchResponse;

public interface ReportService {

	public List<String> getPlanNames();

	public List<String> getPlanStatuses();

	public List<SearchResponse> search(SearchRequest request);

	public void generateExcel(HttpServletResponse response) throws Exception;

	public void generatePdf(HttpServletResponse response) throws Exception;

}