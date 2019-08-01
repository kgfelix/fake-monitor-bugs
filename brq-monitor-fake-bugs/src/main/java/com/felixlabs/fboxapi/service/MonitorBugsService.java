package com.felixlabs.fboxapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.felixlabs.fboxapi.model.Bug;
import com.felixlabs.fboxapi.repository.BugRepository;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, value = "/monitor-bugs")
public class MonitorBugsService {

	@Autowired
	private BugRepository repository;

	@RequestMapping(method = RequestMethod.GET)
	public Bug getBugs() {
		return repository.findAll();
	}

}
