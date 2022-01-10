package com.hmojidra.candidateBackend.dao;

import com.hmojidra.candidateBackend.entity.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.hmojidra.candidateBackend.entity.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}
