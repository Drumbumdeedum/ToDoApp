package com.example.dszalay.todoapp.repository;


import com.example.dszalay.todoapp.todo.ToDo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<ToDo, Long> {
  List<ToDo> findAllByOrderByIdAsc();
}
