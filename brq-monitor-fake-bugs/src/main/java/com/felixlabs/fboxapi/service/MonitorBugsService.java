package com.felixlabs.fboxapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.felixlabs.fboxapi.model.Bug;
import com.felixlabs.fboxapi.model.MonitorBugs;
import com.felixlabs.fboxapi.repository.BugRepository;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, value = "/monitor-bugs")
public class MonitorBugsService {

	@Autowired
	private BugRepository repository;

	@RequestMapping(method = RequestMethod.GET)
	public MonitorBugs getBugs() {
		Iterable<Bug> iterable = repository.findAll();
		List<Bug> target = new ArrayList<Bug>();
		iterable.forEach(target::add);
		
		MonitorBugs bugs = new MonitorBugs();
		bugs.setBugs( target );
		return bugs;
	}

	@PostMapping
	Bug newBug(@RequestBody Bug bug) {
		return repository.save(bug);
	}

}
