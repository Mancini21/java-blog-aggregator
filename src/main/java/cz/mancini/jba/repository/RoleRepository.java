package cz.mancini.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.mancini.jba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String name);

}
