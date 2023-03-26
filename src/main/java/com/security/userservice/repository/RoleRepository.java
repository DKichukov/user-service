package com.security.userservice.repository;

import com.security.userservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    public Role findByName(String name);
}
