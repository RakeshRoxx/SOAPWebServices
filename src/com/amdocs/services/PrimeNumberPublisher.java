package com.amdocs.services;

import javax.xml.ws.Endpoint;

public class PrimeNumberPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8080/rakesh", new PrimeNumber());
		System.out.println("Waiting for client......................");
	}
}
