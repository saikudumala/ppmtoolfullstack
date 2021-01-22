package com.fullstack.ppmtool.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.http.HttpStatus;

@Service
public class MapErrorValidationService {

	public ResponseEntity<?> errorMapValidation(BindingResult result){
		if(result.hasErrors()) {
			Map<String, String> errorMap = new HashMap<String,String>();
			List<FieldError> errors = result.getFieldErrors();
			for(FieldError error: errors) {
				errorMap.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Map>(errorMap,HttpStatus.BAD_REQUEST);
		}
		
			return null;
		
	}
}
