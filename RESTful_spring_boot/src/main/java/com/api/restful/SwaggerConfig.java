package com.api.restful;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// TODO: Auto-generated Javadoc
/**
 * The Class SwaggerConfig.
 */
@Configuration
@PropertySource("classpath:swagger.properties")
@EnableSwagger2
public class SwaggerConfig {

	/** The Constant SWAGGER_API_VERSION. */
	private static final String SWAGGER_API_VERSION = "1.0";
	
	/** The Constant LICENSE_TEXT. */
	private static final String LICENSE_TEXT = "License";
	
	/** The Constant title. */
	private static final String title = "Products REST API";
	
	/** The Constant description. */
	private static final String description = "RESTful API for products";

	/**
	 * Api info.
	 *
	 * @return the api info
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title(title)
				.description(description)
				.license(LICENSE_TEXT)
				.version(SWAGGER_API_VERSION)
				.build();
	}

	/**
	 * Product api.
	 *
	 * @return the docket
	 */
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.pathMapping("/v1")
				.select()
				.build();
	}
	
}
