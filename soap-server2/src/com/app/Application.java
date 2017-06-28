package com.app;

import javax.xml.ws.Endpoint;

import com.soap.PessoaServiceImpl;

public class Application {

	public static void main(String[] args) {
		System.out.println("inicio");
		Endpoint.publish("http://localhost:8888/ws/pessoa", new PessoaServiceImpl());
	}
}