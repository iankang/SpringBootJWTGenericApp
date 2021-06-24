package com.tasks_manager.task.repositories;

import com.tasks_manager.task.entities.ERole;
import com.tasks_manager.task.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);

}
