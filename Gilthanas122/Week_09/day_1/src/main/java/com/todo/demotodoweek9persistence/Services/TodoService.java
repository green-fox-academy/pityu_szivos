package com.todo.demotodoweek9persistence.Services;

import com.todo.demotodoweek9persistence.Models.Assignee;
import com.todo.demotodoweek9persistence.Models.ToDo;
import com.todo.demotodoweek9persistence.Repository.AssigneeRepository;
import com.todo.demotodoweek9persistence.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    ToDoRepository toDoRepository;
    AssigneeRepository assigneeRepository;

    public TodoService() {
    }

    @Autowired
    public TodoService( ToDoRepository toDoRepository, AssigneeRepository assigneeRepository) {
        this.toDoRepository = toDoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    public List<ToDo> searchTodo(String searchTerm){
        return toDoRepository.findByTitleContainsOrDescriptionContainsOrContentContainsOrAssignee_NameContains(searchTerm, searchTerm, searchTerm, searchTerm);
    }

    public List <ToDo> findAllTodos(){
        return (List<ToDo>) toDoRepository.findAll();
    }

    public List <Assignee> listAllAssignees(){
        return (List<Assignee>) assigneeRepository.findAll();
    }

    public void saveTodo(ToDo todo){
        toDoRepository.save(todo);
    }

    public void deleteToDo(Long id){
        List <ToDo> setAssigneeNull = toDoRepository.findAllByAssignee_Id(id);
        setAssigneeNull.forEach(a -> a.setAssignee(null));
        assigneeRepository.deleteById(id);

    }

    public void deleteAssigneeByToDo(Long id){
       toDoRepository.deleteAssignee(id);
    }

    public Assignee get(Long id){
        Optional<Assignee> assignee = assigneeRepository.findById(id);
        if (assignee.isPresent()){
            return assignee.get();
        }
        throw new IndexOutOfBoundsException();
    }
}
