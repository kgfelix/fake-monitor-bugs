package com.felixlabs.fboxapi;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.felixlabs.fboxapi.model.Bug;
import com.felixlabs.fboxapi.model.Comment;

@Configuration
public class MyRepositoryRestConfigurerAdapter extends RepositoryRestConfigurerAdapter   {

	 @Override
	    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	        config.exposeIdsFor(Bug.class, Comment.class);
	    }

}
