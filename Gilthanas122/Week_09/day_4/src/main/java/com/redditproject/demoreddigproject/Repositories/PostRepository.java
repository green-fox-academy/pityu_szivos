package com.redditproject.demoreddigproject.Repositories;

import com.redditproject.demoreddigproject.Models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

   List<Post> findAllByOrderByLikeCounterDesc();
}
