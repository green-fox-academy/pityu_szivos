package com.urlshortener.urlshortener.Repositories;

import com.urlshortener.urlshortener.Models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository <User, String> {
    //@Query(value = "Select u from User u where u.aliasValue = @aliasValue ")
  User findByAliasValue(String aliasValue);
}
