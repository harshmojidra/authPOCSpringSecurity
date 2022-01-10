package com.hmojidra.candidateBackend;

import com.hmojidra.candidateBackend.entity.Candidate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;




@SpringBootApplication
public class CandidateBackendApplication implements RepositoryRestConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(CandidateBackendApplication.class, args);
	}

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		config.exposeIdsFor(Candidate.class);
	}

}
