package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;
import feign.form.ContentType;

@FeignClient(value = "jplaceholder",
url = "https://jsonplaceholder.typicode.com/",
configuration = MyClientConfiguration.class)

@Configuration
public class MyClientConfiguration {
	

	@Bean
	public RequestInterceptor requestInterceptor() {
	  return requestTemplate -> {
	      requestTemplate.header("user", username);
	      requestTemplate.header("password", password);
	      requestTemplate.header("Accept", ContentType.APPLICATION_JSON.getMimeType());
	  };
	
	
	}
}
