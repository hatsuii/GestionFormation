package eu.ensup.demoFormation.presentation;

import javax.xml.ws.Endpoint;

import eu.ensup.demoFormation.service.FormationService;

public class Publisher {

	public static final String URI = "http://localhost:8888/bg";
	public static void main(String[] args) {

		FormationService fs = new FormationService();

		Endpoint ep = Endpoint.publish(URI, fs);

		System.out.println(ep.isPublished());
	}

}
