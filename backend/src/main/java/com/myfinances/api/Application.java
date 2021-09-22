package com.myfinances.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@SpringBootApplication
@Configuration
@EnableConfigurationProperties({ LiquibaseProperties.class })
@ComponentScan("com.myfinances")
public class Application
{
	public static void main(String[] args) {
		SpringApplication.run( Application.class, args );
	}

	protected SpringApplicationBuilder configure( SpringApplicationBuilder application )
	{
		return application.sources( Application.class);
	}

	@Bean
	public RestTemplate restTemplate()
	{
		RestTemplate restTemplate = new RestTemplate();
		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter =
				new MappingJackson2HttpMessageConverter();
		mappingJackson2HttpMessageConverter.setSupportedMediaTypes( Collections.singletonList( MediaType.ALL) );
		restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);

		return restTemplate;
	}
}
