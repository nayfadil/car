package com.master.car.controller;

import java.net.http.HttpHeaders;
import java.util.NoSuchElementException;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.master.car.dto.ErrorResponse;

@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler  {

	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String error = "Malformed JSON request";
		return buildResponseEntity(new ErrorResponse(HttpStatus.BAD_REQUEST, error, ex));
	}

	private ResponseEntity<Object> buildResponseEntity(ErrorResponse apiError) {
		return new ResponseEntity<>(apiError, apiError.getStatus());
	}
	
	
	@ExceptionHandler(NoSuchElementException.class)
	protected ResponseEntity<Object> handleEntityNotFound(NoSuchElementException ex) {
		ErrorResponse apiError = new ErrorResponse(HttpStatus.NOT_FOUND,ex);
		apiError.setMessage(ex.getMessage());
		return buildResponseEntity(apiError);
	}
	
}
