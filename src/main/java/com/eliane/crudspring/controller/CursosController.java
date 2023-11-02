package com.eliane.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eliane.crudspring.model.Curso;
import com.eliane.crudspring.repository.CursoRepository;

@RestController
@RequestMapping("api/cursos")

public class CursosController {

  private final CursoRepository cursoRepository;

  public CursosController(CursoRepository cursoRepository) {
    this.cursoRepository = cursoRepository;
  }

  // @RequestMapping(method = RequestMethod.GET)
  @GetMapping
  public List<Curso> list() {
    return cursoRepository.findAll();
  }

}
