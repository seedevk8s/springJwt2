package com.test.springJwt2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.springJwt2.model.Role;

import java.util.Map;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}