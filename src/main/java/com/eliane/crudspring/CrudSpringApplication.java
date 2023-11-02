package com.eliane.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.eliane.crudspring.model.Curso;
import com.eliane.crudspring.repository.CursoRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

@Bean
  CommandLineRunner initDatabase(CursoRepository cursoRepository){
    return args -> {
      cursoRepository.deleteAll();
      Curso c = new Curso();
      c.setName("angular");
      c.setCategory("front-end");

      cursoRepository.save(c);

    };
  }
}
