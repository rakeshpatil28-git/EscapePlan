package com.execute.plan;

import com.execute.plan.exception.CustomException;

import com.execute.plan.service.IEscapeService;
import com.execute.plan.service.impl.EscapeServiceImpl;

public class EscapLogic {

	public static void main(String[] args) throws CustomException {
		
		IEscapeService iEscapeService =new EscapeServiceImpl();
		
		//inputs for program
		int climbUp=10,climbDown=1,noOfWalls=1,wallHeightsArr[]= {10};
		//int climbUp=5,climbDown=1,noOfWalls=2,wallHeightsArr[]= {9,10};
		
		int jumpsToEscape = iEscapeService.executePlan(climbUp, climbDown, noOfWalls, wallHeightsArr);
		
		/*System.out.println("=========Input Specification========");
		System.out.println("climbUp    :-> "+climbUp);
		System.out.println("climbDown  :-> "+climbDown);
		System.out.println("noOfWalls  :-> "+noOfWalls);
		System.out.println("wallHeights:-> "+Arrays.toString(wallHeightsArr));*/
		
		System.out.println("=========Program Output=============");
		System.out.println("The total number of jumps Jack needs to make to escape from the jail is "+jumpsToEscape);
		

	}

}
