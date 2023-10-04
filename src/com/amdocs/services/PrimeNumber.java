package com.amdocs.services;

import javax.jws.WebService;


@WebService(endpointInterface="com.amdocs.services.PrimeNumberService")
public class PrimeNumber {
	public boolean isPrime(int val){
		if(val < 0) return false;
		if(val == 0 || val == 1) return false;
		
		for(int i = 2; i <= Math.sqrt(val); i++){
			if(val % i == 0) return false;
		}
		
		return true;
	}
}
