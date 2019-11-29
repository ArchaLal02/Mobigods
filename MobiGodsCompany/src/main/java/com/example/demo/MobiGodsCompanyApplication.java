package com.example.demo;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MobiGodsCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobiGodsCompanyApplication.class, args);
		System.out.println("Welcome");
		openHomePage();
	}
	

	  private static void openHomePage() { 
		  System.out.println("Open Browser"); 
		  String url="http://localhost:8083/products";
		  if(Desktop.isDesktopSupported()) { 
			  Desktop desktop=Desktop.getDesktop(); 
			  try {
				  desktop.browse(new URI(url));
			  }catch(IOException | URISyntaxException e) { 
				  e.printStackTrace();
				  } 
			  }else {
				  Runtime runtime=Runtime.getRuntime(); 
				  try {
					  runtime.exec("rundll32 url.dll,FileProtocolHandler "+url); 
					  }catch(IOException e) {
						  e.printStackTrace();
						  }
				  } 
		  }
}
