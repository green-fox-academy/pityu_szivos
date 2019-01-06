package com.urlshortener.urlshortener.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@Entity
public class User {

    @Id
    private String aliasValue;
    private String url;
    private Integer secretCode;
    private Integer accessCounter;


    public User() {
        secretCode = (int) (Math.random() * 10000 + 1);

    }

    public User(String aliasValue, String url) {
        this.aliasValue = aliasValue;
        this.url = url;
        secretCode = (int) (Math.random() * 10000 + 1);
    }

    public String getAliasValue() {
        return aliasValue;
    }

    public void setAliasValue(String aliasValue) {
        this.aliasValue = aliasValue;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(Integer secretCode) {
        this.secretCode = secretCode;
    }

    public Integer getAccessCounter() {
        return accessCounter;
    }

    public void setAccessCounter(Integer accessCounter) {
        this.accessCounter = accessCounter;
    }

    public void incrementAccessCounter(){
        this.accessCounter++;
    }
}
