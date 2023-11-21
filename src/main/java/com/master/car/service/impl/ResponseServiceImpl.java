package com.master.car.service.impl;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import com.master.car.dto.ResponseTemplate;
import com.master.car.dto.ResponseTemplateHeader;
import com.master.car.service.ResponseService;

@Service
public class ResponseServiceImpl implements ResponseService {

	@Override
	public <C> ResponseTemplate<C> buildApiResponse(C data){
		ResponseTemplateHeader header = new ResponseTemplateHeader();
		header.setStatusCode(HttpStatus.OK);
		header.setResponseType(MediaType.APPLICATION_JSON_VALUE);
		
		ResponseTemplate<C> response = new ResponseTemplate<>();
		response.setData(data);
		response.setMessage("Success");
		response.setHeader(header);
		
		return response;
	}
}
