package cz.mancini.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.mancini.jba.entity.Role;
import cz.mancini.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);

}
