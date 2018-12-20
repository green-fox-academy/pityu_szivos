package com.todo.demotodoweek9persistence.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List <ToDo> todos;

    public Assignee() {
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Assignee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", todos=" + todos +
                '}';
    }
}
