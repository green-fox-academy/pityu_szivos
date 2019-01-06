package com.todo.demotodoweek9persistence.Repository;

import com.todo.demotodoweek9persistence.Models.ToDo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {

    List<ToDo> findAllByDone(Boolean done);
    List <ToDo> findByTitleContainsOrDescriptionContainsOrContentContainsOrAssignee_NameContains(String title, String description, String content, String Assignee);

    List <ToDo> findByTitleContains(String text);

    @Modifying
    @Query(value="UPDATE ToDoRepository SET Assignee = NULL WHERE Assignee_Id = id",  nativeQuery = true)
    List<ToDo> deleteAssignee(Long id);


    List <ToDo> findAllByAssignee_Id(Long id);

}
