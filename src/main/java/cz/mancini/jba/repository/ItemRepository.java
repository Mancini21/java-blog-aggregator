package cz.mancini.jba.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import cz.mancini.jba.entity.Blog;
import cz.mancini.jba.entity.Item;
import cz.mancini.jba.entity.Role;

public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	List<Item> findByBlog(Blog blog, Pageable pageable);
	
	Item findByBlogAndLink(Blog blog, String link);

}
