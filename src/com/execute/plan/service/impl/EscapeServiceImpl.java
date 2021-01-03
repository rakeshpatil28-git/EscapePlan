package com.execute.plan.service.impl;

import com.execute.plan.exception.CustomException;
import com.execute.plan.service.IEscapeService;

public class EscapeServiceImpl implements IEscapeService {

	public int executePlan(int climbUp, int climbDown, int noOfWalls, int[] wallHeights) throws CustomException {
		
		if((climbUp<0 || climbUp>104) || (climbDown<0 || climbDown>104) || (noOfWalls<0 || noOfWalls>104)) {
			throw new CustomException("Invalid inputs");
		}
		
		for(int w : wallHeights) {
			if(w<0 || w>1000) {
				throw new CustomException("Invalid height");
			}
		}
		
		int tJumps = 0;
		
		for(int i=0;i<noOfWalls;i++) {		
			
			int slidingAterJump = climbUp-climbDown;
			int totalJumps = (int) Math.ceil((double) (wallHeights[i]-climbUp) / (double) slidingAterJump);
			
			System.out.println(" totalJumps - "+totalJumps);
			
			if(climbUp==wallHeights[i]) {
				tJumps += 1;
			}else {
				if(((totalJumps*slidingAterJump)+climbUp)>=wallHeights[i]) {
					tJumps += totalJumps+1;
				}
			}
			
		}
		
		return tJumps;
	}

	

}
