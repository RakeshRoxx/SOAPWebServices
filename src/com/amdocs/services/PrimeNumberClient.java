package com.amdocs.services;

import java.net.URL;
import java.util.Scanner;

import javax.xml.ws.Service;

import javax.xml.namespace.QName;

public class PrimeNumberClient {
	public static void main(String[] args) throws Exception{
		URL url = new URL("http://127.0.0.1:8080/rakesh?wsdl");
		QName qName = new QName("http://services.amdocs.com/", "PrimeNumberService");
		Service service = Service.create(url, qName);
		PrimeNumberService endPoint = service.getPort(PrimeNumberService.class);
		Scanner input = new Scanner(System.in);
		boolean result = false;
		int value = 0;
		
		System.out.print("Enter a number to check if it's prime or not:  ");
		value = Integer.parseInt(input.nextLine());
		
		result = endPoint.isPrime(value);
		
		System.out.println(value + " is Prime : " + result);
		
		input.close();
	}
}
