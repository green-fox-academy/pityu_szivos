package com.todo.demotodoweek9persistence.Models;

import javax.persistence.*;

@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    private String description;
    private Boolean urgent;
    private Boolean done;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Assignee assignee;

    public ToDo() {
        urgent = false;
        done = false;
    }

    public ToDo(String title, String content, String description) {
        this.title = title;
        this.content = content;
        this.description = description;
        urgent = false;
        done = false;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public ToDo(String title, Boolean urgent, Boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
