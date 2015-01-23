package cz.mancini.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.mancini.jba.entity.Blog;
import cz.mancini.jba.entity.Role;
import cz.mancini.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
	
	List<Blog> findByUser(User user);

}
