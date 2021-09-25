package com.paulogrillo.blog.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paulogrillo.blog.model.Postagens;

@Repository
public interface PostagemRepository extends JpaRepository<Postagens, Long> {
	
	public List<Postagens> findAllByTituloContainingIgnoreCase(String titulo);
	
}
