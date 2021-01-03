package com.execute.plan.service;

import com.execute.plan.exception.CustomException;

public interface IEscapeService {
	
	int executePlan(int climbUp,int climbDown,int noOfWalls,int[] wallHeights) throws CustomException;

}
