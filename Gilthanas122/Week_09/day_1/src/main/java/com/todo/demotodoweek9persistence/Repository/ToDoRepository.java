package com.todo.demotodoweek9persistence.Repository;

import com.todo.demotodoweek9persistence.Models.ToDo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {

    List<ToDo> findAllByDone(Boolean done);
}
