package com.eliane.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eliane.crudspring.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
