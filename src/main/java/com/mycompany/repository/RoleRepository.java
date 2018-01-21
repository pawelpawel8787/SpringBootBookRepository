package com.mycompany.repository;

import com.mycompany.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HP on 2018-01-21.
 */
public interface RoleRepository extends JpaRepository<Roles, Long> {

    Roles findByRole(String role);

}
