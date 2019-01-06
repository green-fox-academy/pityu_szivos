package com.urlshortener.urlshortener.Services;

import com.urlshortener.urlshortener.Models.User;
import com.urlshortener.urlshortener.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Optional;

@Service
public class UrlShortenerService{
   UserRepository userRepository;

   @Autowired
    public UrlShortenerService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveAlias(User user) {
       if (userRepository.findByAliasValue(user.getAliasValue()) == null){
           userRepository.save(user);
           user.incrementAccessCounter();
           return user;
       }
       return null;
    }

    public User findByAliasValueContains(String aliasValue) {
       userRepository.findByAliasValue(aliasValue).incrementAccessCounter();
       return  userRepository.findByAliasValue(aliasValue);
    }

}
