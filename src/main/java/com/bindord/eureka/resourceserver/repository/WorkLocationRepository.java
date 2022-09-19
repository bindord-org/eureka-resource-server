package com.bindord.eureka.resourceserver.repository;

import com.bindord.eureka.resourceserver.domain.specialist.WorkLocation;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WorkLocationRepository extends ReactiveCrudRepository<WorkLocation, UUID> {

}