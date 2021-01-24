package com.fullstack.ppmtool.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.fullstack.ppmtool.exceptions.ProjectIdException;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class customExceptionHandler {

	@ExceptionHandler(ProjectIdException.class)
	public ResponseEntity<Object> handleUniqueProjectIdException(ProjectIdException ex, WebRequest request)
	{
		return new ResponseEntity <>(ex.getMessage(),HttpStatus.BAD_REQUEST);
		
	}
}
