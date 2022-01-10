package com.hmojidra.candidateBackend.dao;

import com.hmojidra.candidateBackend.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface CandidateRepository extends JpaRepository<Candidate, Long> {


}
