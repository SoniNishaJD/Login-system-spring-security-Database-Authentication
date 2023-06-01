package com.soninisha.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soninisha.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}