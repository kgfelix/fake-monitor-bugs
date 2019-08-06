package com.felixlabs.fboxapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.felixlabs.fboxapi.model.Bug;

public interface BugRepository extends CrudRepository<Bug, Integer> {

}
