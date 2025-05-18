package com.prashant.service;

import com.prashant.exception.ScaleUpIndiaException;


public interface CalculatorService {
	void divide(Integer... array) throws ScaleUpIndiaException;
}
