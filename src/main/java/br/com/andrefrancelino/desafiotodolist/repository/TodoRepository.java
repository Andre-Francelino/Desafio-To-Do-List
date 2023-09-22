package br.com.andrefrancelino.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andrefrancelino.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
