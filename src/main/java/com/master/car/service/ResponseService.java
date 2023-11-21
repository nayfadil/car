package com.master.car.service;

import com.master.car.dto.ResponseTemplate;

public interface ResponseService {

	<C> ResponseTemplate<C> buildApiResponse(C data);
}
