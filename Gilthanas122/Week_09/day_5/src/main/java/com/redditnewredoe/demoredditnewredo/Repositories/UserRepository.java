package com.redditnewredoe.demoredditnewredo.Repositories;

import com.redditnewredoe.demoredditnewredo.Models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
   // @Query(value = "SELECT * FROM User ORDER BY id DESC LIMIT 1", nativeQuery = true)
    // User findLastUserId();
}
