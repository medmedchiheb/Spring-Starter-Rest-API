package com.enable.restfullapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	

	  public static final Contact DEFAULT_CONTACT = new Contact("Mohamed chiheb", "--", "mc.benjemaa@gmail.com");
	  public static final ApiInfo DEFAULTAPIINFO = new ApiInfo(
			  "Spring-Starter-Rest-API", "Tutoriel Api Documentation", "1.0", "urn:tos",
	          DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
	  
	  
	private static final Set<String> DEFAULT_PRODUCES = new HashSet<>(
			Arrays.asList("application/json","application/xml"));

	//private static final ApiInfo DEFAULTAPIINFO = null;

	/*
	 * Config swagger documentation for Restfull webservices
	 * 
	 */
	@Bean 
	public Docket api() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULTAPIINFO)
				.produces(DEFAULT_PRODUCES)
				.consumes(DEFAULT_PRODUCES);
	}
}
