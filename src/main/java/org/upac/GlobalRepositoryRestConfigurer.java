package org.upac;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.upac.entities.Contact;

@SuppressWarnings("deprecation")
@Configuration
public class GlobalRepositoryRestConfigurer extends RepositoryRestConfigurerAdapter{
	
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repositoryRestConfiguration){
		repositoryRestConfiguration.setReturnBodyOnCreate(true);
		repositoryRestConfiguration.setReturnBodyOnUpdate(true);
		repositoryRestConfiguration.exposeIdsFor(Contact.class		);
		repositoryRestConfiguration.getCorsRegistry()
		.addMapping("/**")
		.allowedOrigins("*")
		.allowedHeaders("*")
		.allowedMethods("OPTIONS", "HEAD", "GET", "PUT", "PATCH", "POST", "DELETE");
	}
}
