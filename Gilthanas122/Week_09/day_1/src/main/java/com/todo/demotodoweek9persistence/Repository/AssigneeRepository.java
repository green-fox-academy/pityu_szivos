package com.todo.demotodoweek9persistence.Repository;

import com.todo.demotodoweek9persistence.Models.Assignee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssigneeRepository extends CrudRepository <Assignee, Long>{

    List<Assignee> findAllByName(String name);
    Assignee findByName(String text);

}
