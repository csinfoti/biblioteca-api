package com.fuctura.biblioteca.repositories;

import com.fuctura.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Livro_Repository  extends JpaRepository<Livro, Integer> {
}
